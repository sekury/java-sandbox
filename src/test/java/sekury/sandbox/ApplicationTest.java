package sekury.sandbox;

import org.junit.jupiter.api.Test;
import sekury.sandbox.annotation.Version;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    public void packageVersion() {
        Class<Application> applicationClass = Application.class;
        Package pack = applicationClass.getPackage();
        Version version = pack.getAnnotation(Version.class);
        assertNotNull(version);
        assertEquals(version.major(), 1);
        assertEquals(version.minor(), 0);
    }
}