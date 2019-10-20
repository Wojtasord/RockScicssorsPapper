public class WrongInputException extends Throwable {
    @SuppressWarnings("WeakerAccess")
    public WrongInputException(String message) {
        super(message);
    }

    public WrongInputException(String message, Throwable cause) {
        super(message, cause);
    }
}
