package ReportError;

import ReportError.Enum.OperationType;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static ReportError.Enum.ReportTip.INVALID_FORMAT;
import static ReportError.Enum.ReportTip.SUCCESS;

public class WeChatReply {

    private final static String REGEX_SPECIAL1 = "#(.*?)#";
    private final static String REGEX_SPECIAL2 = "\\{(.*?)\\}";
    private final static String REGEX_SPECIAL3 = "(\\[[^\\]]*\\])";


    public static void main(String[] args) {
        String msg = "";


        msg = "#取消报障# {1001}";
        msg = "#报障修复# {1001}";
        msg = "#报障详情# {1001}";
        msg = "#报障清单#";
        msg = "#更新报障# {6} & [处理人=吴少锋]";

        System.out.println(INVALID_FORMAT.getValue());
        String type = getSubUtilSimple(msg, REGEX_SPECIAL1);
        OperationType operationType = OperationType.getType(type);

        switch (operationType){
            case REPORT_ERROR:
                handleReport(msg);
                break;
            case REPORT_HANDLE:
                queryProgress(msg);
                break;
            case CANCEL_ERROR:
                System.out.println(cancelError(msg));
                break;
            case UPDATE_ERROR:
                updateError(msg);
                break;
            case FIXED_ERROR:
                System.out.println(fixedError(msg));
                break;
            case ERROR_LIST:
                getErrorList();
                break;
            case ERROR_DETAIL:
                System.out.println(getErrorInfo(msg));
                break;
        }
    }


    /**
     * 报障详情
     *
     * @param msg
     * @return
     */
    private static String getErrorInfo(String msg){
        //TODO 某条故障
        return "报障详情";
    }


    /**
     * 报障列表
     * @return
     */
    private static String getErrorList(){
        //TODO 查询故障
        return "报障清单";
    }

    /**
     * 报障修复
     * @param msg
     * @return
     */
    private static String fixedError(String msg){
        String errorId = getSubUtilSimple(msg, REGEX_SPECIAL2);
        //TODO 取消报障
        return SUCCESS.getValue();
    }

    /**
     * 修改报障
     * @param msg
     * @return
     */
    private static String updateError(String msg){
        String errorId = getSubUtilSimple(msg, REGEX_SPECIAL2);
        String updateContent = getSubUtilSimple(msg, REGEX_SPECIAL3);
        String[] contents = updateContent.split("=");
        String value = contents[0];
        String content = contents[1];
        //TODO 取消报障
        return SUCCESS.getValue();
    }


    /**
     * 取消报障
     * @param msg
     * @return
     */
    private static String cancelError(String msg){
        String errorId = getSubUtilSimple(msg, REGEX_SPECIAL2);
        //TODO 取消报障
        return SUCCESS.getValue();
    }

    /**
     * 查询报障进度
     * @param msg
     * @return
     */
    private static String queryProgress(String msg){
        String errorId = getSubUtilSimple(msg, REGEX_SPECIAL2);
        //TODO 查询当前进度。
        return "xxx 在处理中";
    }

    /**
     *
     * 处理上报内容
     *
     * @param msg
     * @return
     */
    public static String handleReport(String msg){
        List<String> list = extractMessageByRegular(msg);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i+"-->"+list.get(i));
        }

        if(list.size() < 7){
            return INVALID_FORMAT.getValue();
        }

        String title = list.get(0);
        String errorType = list.get(1);
        String content = list.get(2);
        String errorYy = list.get(3);
        String deviceInfo = list.get(4);
        String version = list.get(5);
        String influence = list.get(6);

        //TODO insert sql

        return "success";
    }



    /**
     * 使用正则表达式提取中括号中的内容
     * @param msg
     * @return
     */
    public static List<String> extractMessageByRegular(String msg){

        List<String> list=new ArrayList<>();
        Pattern p = Pattern.compile(REGEX_SPECIAL3);
        Matcher m = p.matcher(msg);
        while(m.find()){
            list.add(m.group().substring(1, m.group().length()-1));
        }
        return list;
    }

    /**
      * 返回单个字符串，若匹配到多个的话就返回第一个，方法与getSubUtil一样
      * @param soap
      * @param rgex
      * @return
      */
    public static String getSubUtilSimple(String soap, String rgex){
        Pattern pattern = Pattern.compile(rgex);// 匹配的模式
        Matcher m = pattern.matcher(soap);
        while(m.find()){
            return m.group(1);
        }
        return "";
    }
}
