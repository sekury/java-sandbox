package sekury.sandbox.generic;

import java.util.List;

public class HeapPollutionExample {

    @SuppressWarnings("unchecked")
    public static <T> void addListsToList(List<T> list, List<T>... lists) {
        for (List l : lists) {
            l.add(new Object());
        }
        for (List<T> l : lists) {
            list.addAll(l);
        }
    }
}
