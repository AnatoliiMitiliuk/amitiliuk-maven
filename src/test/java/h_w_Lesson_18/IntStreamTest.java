package h_w_Lesson_18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class IntStreamTest {
    @Test
    public void averageColTest() {
        List<Integer> collection = new ArrayList<>();
        int colSize = 5;
        double expectedAverage = 0.0;
        for (int i = 0; i < colSize; i++) {
            collection.add(i);
            expectedAverage += i;
        }

        expectedAverage /= colSize;
        double actualAverage = IntStream.averageCol(collection);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }
}
