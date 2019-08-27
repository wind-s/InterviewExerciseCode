package text;

import ReportError.ErrorInfo;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //showYesterday();
        //hahah();
        //floatMissing();
        try {
            sdsd();
        } catch (Exception e) {
            e.printStackTrace();
        }
        floatTest();
    }


    public static void floatTest(){
        float a = 0.3f;
        float b = 0.6f;
        System.out.println(a+b);
    }

    public static void sdsd() throws Exception {
        ErrorInfo errorInfo = new ErrorInfo();

        String filedName = "titile";    //filedName以后是从某个方法获取的
        Field name = errorInfo.getClass().getDeclaredField(filedName);
        name.setAccessible(true);
        System.out.println(name.get(errorInfo));
        name.set(errorInfo, "hahahha");
        System.out.println(name.get(errorInfo));
        //name.setAccessible(false);
    }


    public static void hahah() {
        float a = 20000000.0f;
        float b = 1.0f;
        float c = a + b;
        System.out.println("c is " + c);
        float d = c - a;
        System.out.println("d is " + d);
    }


    public static void floatMissing() {
        float sum = 0.0f;
        for (int i = 0; i < 20000000; i++) {
            float x = 1.0f;
            sum += x;
        }
        System.out.println("sum is " + sum);
    }

    //获取昨天的日期时间段
    public static void showYesterday(){
        Calendar ca = Calendar.getInstance();// 得到一个Calendar的实例

        try {
            // 对 calendar 设置时间的方法
            // 设置传入的时间格式
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            // 指定一个日期
            Date date = dateFormat.parse("2019-06-01 13:24:16");
            // 对 calendar 设置为 date 所定的日期
            ca.setTime(date);

            // 按特定格式显示刚设置的时间
            String str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(ca.getTime());
            System.out.println(str);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }



        //ca.setTime(new Date());// 设置时间为当前时间
        //ca.add(Calendar.YEAR,-1);// 年份减1
        //ca.add(Calendar.MONTH,-1);// 月份减1
        ca.add(Calendar.DATE,-1);// 日期减1
        Date resultDate = ca.getTime();//结果
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd ");
        String fmtdt = simpleDateFormat.format(resultDate);
        String StartTime = fmtdt+"00:00:00";
        String EndTime = fmtdt+"23:59:59";

        System.out.println("starttime:"+ StartTime);
        System.out.println("endTime:"+ EndTime);
    }
}
