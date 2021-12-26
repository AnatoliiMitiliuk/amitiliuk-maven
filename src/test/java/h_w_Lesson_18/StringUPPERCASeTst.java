package h_w_Lesson_18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringUPPERCASeTst {
    List<String> list = Arrays.asList("trait", "acquaintance", "\t\n" +
            "vital", "ace", "\t\n" +
            "persuade", "vivid");
    @Test
    public void filter_to_uppercase_test() {
//        expected
        List<String> newList = new ArrayList<>();
        for (String str : list) {
            if (str.matches("^(?i:[aeiouy]).*")) {
                newList.add(str.toUpperCase());
            }
        }
//        actual

        Assertions.assertEquals(newList, StringUPPERCASe.filterList(list));
    }
}
