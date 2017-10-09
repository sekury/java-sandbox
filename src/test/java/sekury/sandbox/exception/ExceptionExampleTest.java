package sekury.sandbox.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionExampleTest {
    @Test
    void throwExceptionFromFinallyBlock() {
        Exception e = assertThrows(Exception.class, ExceptionExample::throwException);
        assertEquals("finally exception", e.getMessage());
    }

}