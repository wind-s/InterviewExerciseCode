package ReportError.Enum;

public enum TempParam {
    TITLE("标题", "titile"),
    ERROR_TYPE("报障分类", "error_type"),
    REPORT_PERSON("客服", "report_person"),
    ERROR_TIME("故障时间", "error_time"),
    DEVICE("设备信息", "device_info"),
    APP_VERSIO("app版本","app_version"),
    CONTENT("报障内容", "content"),
    YY("YY","yy"),
    REPORT_FILE("附件", "report_file"),
    INFLUENCE("影响范围", "influence"),
    REMARK("备注", "remark");

    private String value;
    private String name;

    private TempParam(String value, String name){
        this.value = value;
        this.name = name;
    }
}
