package com.shop.dto;

public class Result <T>{



    private   boolean   success; //是否成功标志

    private T data; //超过时返回的数据

    private   String  errorMsg;  //错误信息

    private   int   errorCode;  //



    //错误时gouza构造方法

    public Result() {
    }

    //错误时的构造器

    public Result(boolean success, T data, String errorMsg, int errorCode) {

        this.success = success;
        this.data = data;
        this.errorMsg = errorMsg;
        this.errorCode = errorCode;
    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
