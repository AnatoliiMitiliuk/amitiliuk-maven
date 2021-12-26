package h_w_Lesson_18;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringLowerCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("add", "hail", "precise", "\t\n" +
                "list", "observe", "socket", "newsflash", "heaps", "\t\n" +
                "java", "utterances", "raven", "moody", "barn", "\t\n" +
                "memory", "wonder", "euphoria");
        System.out.println(list);
        System.out.println(lowerCaseSort(list));
    }

    public static List<String> lowerCaseSort(Collection<String> collection) {
        Predicate<String> lowerCase = Pattern
                .compile("^([a-z]).*")
                .asPredicate();
        return collection
                .stream()
                .filter(lowerCase)
                .filter(e -> (e.length() == 4))
                .collect(Collectors.toList());
    }



}
