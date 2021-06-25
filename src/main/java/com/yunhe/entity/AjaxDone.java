package com.yunhe.entity;

import java.io.Serializable;

public class AjaxDone implements Serializable {

    private Integer statusCode;
    private String message;
    private Object data;

    public AjaxDone() {
    }
    public AjaxDone(Integer statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;

    }
    public AjaxDone(Integer statusCode, String message, Object date) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = date;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setDate(Object data) {
        this.data = data;
    }
}
