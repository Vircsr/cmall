package com.csr.cmall.common.exception;


import com.csr.cmall.common.api.IErrorCode;

/**
 * 断言处理类，用于抛出各种API异常
 * Create by Chen on 2020/10/24
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
