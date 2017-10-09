package sekury.sandbox.exception;

public class ExceptionExample {
    public static void throwException() throws Exception {
        try {
            throw new Exception("try exception");
        } catch (Exception e) {
            throw new Exception("catch exception");
        } finally {
            throw new Exception("finally exception");
        }
    }
}
