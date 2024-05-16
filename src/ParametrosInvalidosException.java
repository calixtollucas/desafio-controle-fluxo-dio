public class ParametrosInvalidosException extends RuntimeException{
    public ParametrosInvalidosException() {
        super();
    }

    public ParametrosInvalidosException(String message) {
        super(message);
    }

    public ParametrosInvalidosException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParametrosInvalidosException(Throwable cause) {
        super(cause);
    }

    protected ParametrosInvalidosException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
