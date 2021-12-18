package h_w_Lesson_12;

import h_w_Lesson_12.Interfaces.StringCollection;
import h_w_Lesson_12.Interfaces.StringCollectionImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestList {

    private StringCollection arr;

    @BeforeEach
    public void init() {
        arr = new StringCollectionImpl();
        arr.add("some string");
        arr.add("one more string");
        arr.add("and one more string");
        arr.add("string");
    }

    @Test
    void testSize(){
        Assertions.assertEquals(4, arr.size());
    }

    @Test
    void testGet(){
        Assertions.assertEquals("string", arr.get(3));

    }

    @Test
    void testDelete(){
        arr.delete("string");
        Assertions.assertFalse(arr.contains("string"));

    }

    @Test
    void testAdd(){
        arr.add("string2");
        Assertions.assertTrue(arr.contains("string2"));
        Assertions.assertTrue(arr.size()==5);

    }

    @Test
    void testClear(){
        arr.clear();
        Assertions.assertEquals(0, arr.size());
    }

    @Test
    void testEquals(){
        StringCollection arr2 = new StringCollectionImpl();
        arr2.add("some string");
        arr2.add("one more string");
        arr2.add("and one more string");
        arr2.add("string");
        Assertions.assertTrue(arr.equals(arr2));
    }

    @Test
    void testContains(){
        Assertions.assertTrue(arr.contains("some string"));
    }

}
