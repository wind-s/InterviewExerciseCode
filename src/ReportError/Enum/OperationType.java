package ReportError.Enum;

public enum OperationType {
    REPORT_ERROR("报障",1),
    REPORT_HANDLE("报障处理",2),
    CANCEL_ERROR("取消报障",3),
    UPDATE_ERROR("更新报障",4),
    FIXED_ERROR("报障修复",5),
    ERROR_LIST("报障清单",6),
    ERROR_DETAIL("报障详情",7);

    private String value;
    private Integer index;

    OperationType(String value, Integer index){
        this.value = value;
        this.index = index;
    }

    public static OperationType  getType(String value){
        for(OperationType operationType :OperationType.values()){
            if(value.equals(operationType.value)){
                return operationType;
            }
        }
        return null;
    }
}
