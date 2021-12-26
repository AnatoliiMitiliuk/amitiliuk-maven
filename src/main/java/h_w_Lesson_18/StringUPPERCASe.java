package h_w_Lesson_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUPPERCASe {
    static List<String> stringList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(initStringList());
        System.out.println(filterList(stringList));

    }

    private static List<String> initStringList() {
        stringList = Arrays.asList("solicitor", "observe", "\t\n" +
                "praise", "evolve", "\t\n" +
                "revise", "attract", "vast");
        return stringList;
    }

    static List<String> filterList(List<String> list) {
        list = list.stream()
                .filter(str -> str.matches("^(?i:[aeiouy]).*"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        return list;
    }

}
