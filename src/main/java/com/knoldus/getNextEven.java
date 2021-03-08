package com.knoldus;

import java.util.function.Function;

public class getNextEven {
    public static Function<Long,Object> getNextEvenNumber= (number) -> number%2 == 0? number+2:number+1;
}
