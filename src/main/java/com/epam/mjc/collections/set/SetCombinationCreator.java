package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        HashSet<String> set = new HashSet<>();
        for (var item : thirdSet) {
            if (firstSet.contains(item)) {
                firstSet.remove(item);
                continue;
            }
            if (secondSet.contains(item)) {
                secondSet.remove(item);
                continue;
            }
            set.add(item);
        }
        for (var item : firstSet) {
            if (secondSet.contains(item)) {
                set.add(item);
            }
        }
        return set;
    }
}
