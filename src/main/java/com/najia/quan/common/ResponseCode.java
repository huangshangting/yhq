package com.najia.quan.common;

public enum ResponseCode {
    SUCCESS(0, "SUCCESS"),
    FAILED(1, "FAILED");

    private int code;

    private String msg;

    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
