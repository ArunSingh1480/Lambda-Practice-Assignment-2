package com.knoldus;

import java.util.function.Function;

@FunctionalInterface
public interface Even {
    Function<Integer, Integer> nextEven();
}
