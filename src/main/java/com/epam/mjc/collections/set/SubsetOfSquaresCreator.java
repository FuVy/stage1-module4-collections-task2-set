package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> set = new HashSet<>();
        sourceList.stream().forEach(x -> {
            var num = x * x;
            if (num >= lowerBound && num <= upperBound) {
                set.add(num);
            }
        });
        return set;
    }
}
