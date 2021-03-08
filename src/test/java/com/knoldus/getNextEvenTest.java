package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class getNextEvenTest {

    @Test
    void getNextEvenTest(){
        long test1= (Long) getNextEven.getNextEvenNumber.apply(123456780L);
        Assertions.assertEquals(Long.valueOf(123456782L), test1);
    }

    @Test
    void getNotNextEven(){
        long test2= (Long) getNextEven.getNextEvenNumber.apply(123456781L);
        Assertions.assertEquals(Long.valueOf(123456782L), test2);

    }
    @Test
    void whenvalueiszero(){
        long test3=(long)  getNextEven.getNextEvenNumber.apply(0L);
        Assertions.assertEquals(Long.valueOf(2L),test3);
    }

    @Test
    void whenvalueisNegative(){
        long test4=(long)  getNextEven.getNextEvenNumber.apply(-1L);
        Assertions.assertEquals(0L,test4);
    }


}