package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();
        for (var item : sourceList) {
            if (item % 2 == 1) {
                set.add(item);
                set.add(item*2);
                continue;
            }
            do {
                set.add(item);
                item /= 2;
            } while (item % 2 == 0);
            set.add(item);
        }
        return set;
    }
}
