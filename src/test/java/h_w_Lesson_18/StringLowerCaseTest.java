package h_w_Lesson_18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StringLowerCaseTest {
    @Test
    public void lowerCaseTest () {
        List<String> collection = new ArrayList<>();
        collection.add("kj;df");
        collection.add("gfhg");
        collection.add("hghvfd");
        collection.add("wriob");
        collection.add("yubn");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("gfhg");
        expectedList.add("yubn");

        collection = StringLowerCase.lowerCaseSort(collection);
        Assertions.assertEquals(expectedList, collection);

    }
}
