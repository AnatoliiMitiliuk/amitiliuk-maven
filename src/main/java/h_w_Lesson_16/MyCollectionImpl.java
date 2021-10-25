package h_w_Lesson_16;

import java.util.Objects;

public class MyCollectionImpl implements StringCollection {

    private String[] arr = new String[0];

    @Override
    public String get(int index) {
        return arr[index];
    }

    @Override
    public boolean add(String str) {
        String[] newArr = new String[arr.length + 1];
        for (int x = 0; x < arr.length; x++) {
            newArr[x] = arr[x];
        }
        newArr[newArr.length - 1] = str;
        this.arr = newArr;
        return true;
    }

    @Override
    public boolean add(int index, String str) {
        if (index > arr.length + 1 || index < 0) {
            return false;
        } else {
            String[] newArr = new String[arr.length + 1];
            int c = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i != index) {
                    newArr[c] = arr[i];
                    c++;
                } else {
                    newArr[c] = str;
                    newArr[c + 1] = arr[i];
                    c += 2;
                }
            }
            arr = newArr;
            return true;
        }

    }

    @Override
    public boolean delete(String str) {
        if (contains(str)) {
            String[] newArr = new String[arr.length - 1];
            for (int i = 0; i < newArr.length; i++) {
                int c = i;
                if (arr[i].equals(str)) {
                    c++;
                }
                newArr[i] = arr[c];
            }
            arr = newArr;
            return true;
        }

        return false;
    }

    @Override
    public boolean contains(String str) {
        if (str == null) {
            for (String s : arr) {
                if (Objects.equals(s, str)) {
                    return true;
                }
            }
        } else {
            for (String s : arr) {
                if (Objects.equals(s, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean equals(StringCollection collection) {

        if (collection.size() == arr.length) {
            for (int i = 0; i < collection.size(); i++) {
                if (!collection.get(i).equals(arr[i])) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean clear() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = null;
        }
        arr = new String[0];

        return true;
    }

    @Override
    public int size() {
        return this.arr.length;
    }
}
