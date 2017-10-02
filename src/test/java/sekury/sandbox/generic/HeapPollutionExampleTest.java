package sekury.sandbox.generic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static sekury.sandbox.generic.HeapPollutionExample.addListsToList;

class HeapPollutionExampleTest {
    @SuppressWarnings({"unchecked", "ResultOfMethodCallIgnored"})
    @Test
    public void shouldThrowClassCastException() {
        assertThrows(ClassCastException.class, () -> {
            List<String> list = new ArrayList<>();
            addListsToList(list, new ArrayList<>());
            String str = list.get(0);
        });
    }
}