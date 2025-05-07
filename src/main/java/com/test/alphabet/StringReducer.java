package com.test.alphabet;

import com.test.alphabet.strategy.ReductionStrategy;

public class StringReducer {
    private final ReductionStrategy strategy;

    public StringReducer(ReductionStrategy strategy) {
        this.strategy = strategy;
    }

    public String reduce(String input) {
        return strategy.apply(input);
    }
}
