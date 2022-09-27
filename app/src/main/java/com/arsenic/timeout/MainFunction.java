package com.arsenic.timeout;

public class MainFunction {

    private String operationName;
    private Integer operationImage;

    public MainFunction(String operationName, Integer operationImage) {
        this.operationName = operationName;
        this.operationImage = operationImage;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public Integer getOperationImage() {
        return operationImage;
    }

    public void setOperationImage(Integer operationImage) {
        this.operationImage = operationImage;
    }
}
