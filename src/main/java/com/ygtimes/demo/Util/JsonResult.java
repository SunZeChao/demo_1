package com.ygtimes.demo.Util;

/**
 * 封装服务器端向客户端响应的结果
 * @author <T> 服务器端向客户端响应的数据
 * @date 2019/12/9 - 21:13
 */
public class JsonResult<T> {
    private Integer state;
    private String message;
    private T data;

    public Integer getState() {
        return state;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "state=" + state +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public JsonResult(Integer state, String message, T data) {
        this.state = state;
        this.message = message;
        this.data = data;
    }

    public JsonResult(Integer state, T data) {
        this.state = state;
        this.data = data;
    }

    public JsonResult(T data) {
        this.data = data;
    }

    public JsonResult(Integer state) {
        this.state = state;
    }

    public JsonResult(Throwable e) {
        this.message = e.getMessage();
    }
}
