package com.ygtimes.demo.service.ex;

/**
 * 没有找到异常
 * @author
 * @date 2019/12/10 - 15:21
 */
public class NotFountException extends ServiceException {
    public NotFountException() {
        super();
    }

    public NotFountException(String message) {
        super(message);
    }

    public NotFountException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFountException(Throwable cause) {
        super(cause);
    }

    protected NotFountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
