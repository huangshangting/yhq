package com.najia.quan.common;

import java.io.Serializable;

/**
 * 服务端返回信息封装
 */
public class ServerResponse<T> implements Serializable {

    /**
     * 返回状态
     */
    private int status;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private T data;

    private ServerResponse(int status) {
        this.status = status;
    }

    private ServerResponse(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    private ServerResponse(int status, T data) {
        this.status = status;
        this.data = data;
    }

    private ServerResponse(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    /**
     * 只返回成功状态码
     * @param <T> 泛型
     * @return ServerResponse
     */
    public static <T> ServerResponse<T> operateSuccess() {
        return new ServerResponse<>(ResponseCode.SUCCESS.getCode());
    }

    public static <T> ServerResponse<T> operateSuccess(String msg) {
        return new ServerResponse<>(ResponseCode.SUCCESS.getCode(), msg);
    }

    public static <T> ServerResponse<T> operateSuccess(T data) {
        return new ServerResponse<>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMsg(), data);
    }

    public static <T> ServerResponse<T> operateSuccess(String msg, T data) {
        return new ServerResponse<>(ResponseCode.SUCCESS.getCode(), msg, data);
    }

    /**
     * 返回成功状态码和默认提示信息
     * @param <T> 泛型
     * @return ServerResponse
     */
    public static <T> ServerResponse<T> operateSuccessMsg() {
        return new ServerResponse<>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMsg());
    }

    public static <T> ServerResponse<T> operateFailed() {
        return new ServerResponse<>(ResponseCode.FAILED.getCode());
    }

    public static <T> ServerResponse<T> operateFailed(String msg) {
        return new ServerResponse<>(ResponseCode.FAILED.getCode(), msg);
    }

    public static <T> ServerResponse<T> operateFailedMsg() {
        return new ServerResponse<>(ResponseCode.FAILED.getCode(), ResponseCode.FAILED.getMsg());
    }

}
