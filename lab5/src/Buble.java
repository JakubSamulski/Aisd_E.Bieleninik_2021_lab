package Zad1;

import java.util.Comparator;

public class Buble<T> {
    private final Comparator<T> _comparator;

    public Buble(Comparator<T> comparator) {
        _comparator = comparator;
    }


    public T[] sort(T[] list) {
        int size = list.length;
        for (int pass = 1; pass < size; ++pass) {
            for (int left = 0; left < (size - pass); ++left) {
                int right = left + 1;
                if (_comparator.compare(list[left], list[right]) > 0)
                    swap(list, left, right);
            }
        }
        return list;
    }
    private void swap(T[] list, int left, int right) {
        T temp = list[left];
        list[left] = list[right];
        list[right] = temp;
    }
}
