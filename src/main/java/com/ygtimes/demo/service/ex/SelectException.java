package com.ygtimes.demo.service.ex;

/**
 * @author
 * @date 2019/12/10 - 15:01
 */
public class SelectException extends ServiceException {
    public SelectException() {
        super();
    }

    public SelectException(String message) {
        super(message);
    }

    public SelectException(String message, Throwable cause) {
        super(message, cause);
    }

    public SelectException(Throwable cause) {
        super(cause);
    }

    protected SelectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
