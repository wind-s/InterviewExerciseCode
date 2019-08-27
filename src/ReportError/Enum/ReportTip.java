package ReportError.Enum;

public enum ReportTip {

    SUCCESS("操作成功"),
    INVALID_FORMAT("无效格式"),
    NOT_FOUND("查无此报障");


    private String value;

    public String getValue(){
        return this.value;
    }

    ReportTip(String value){
        this.value = value;
    }
}
