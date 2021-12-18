package h_w_Lesson_12.Interfaces;

public interface StringCollection {
    String get(int index);

    void add(String str);

    boolean add(int index, String str);

    boolean delete(String str);

    boolean contains(String str);

    boolean equals(StringCollection collection);

    boolean clear();

    int size();
}
