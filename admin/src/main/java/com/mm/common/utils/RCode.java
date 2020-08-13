package com.mm.common.utils;

/**
 * 错误
 */
public enum RCode {

    // 1xx 参数校验错误
    PARAM_FAILED(100, "参数错误");

    // 5xx 服务异常错误

    private Integer code;

    private String msg;

    RCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
