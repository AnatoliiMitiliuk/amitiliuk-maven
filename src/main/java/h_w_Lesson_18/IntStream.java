package h_w_Lesson_18;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IntStream {
    public static void main(String[] args) {
        System.out.println(initIntList());
        System.out.println(averageCol(initIntList()));

    }

    public static List<Integer> initIntList() {
        List<Integer> list = new ArrayList<>();
        int n = 10;
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        for (int i = 0; i < n; i++) {
            Integer r = rand.nextInt(100);
            list.add(r);
        }
        return list;
    }

    public static double averageCol(List<Integer> collection){
        return collection.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }
}
