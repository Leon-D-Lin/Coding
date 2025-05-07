package com.test.alphabet;


import com.test.alphabet.strategy.RemoveStrategy;
import com.test.alphabet.strategy.ReplaceStrategy;
import org.junit.Test;

public class StringReducerTest {
    @Test
    public void testRemoveStrategy(){
        StringReducer stringRemove = new StringReducer(new RemoveStrategy());

        String aaaa = stringRemove.reduce("aaaa");
        System.out.println("aaa ==> " + aaaa);
    }

    @Test
    public void testReplaceStrategy(){
        StringReducer stringReplace = new StringReducer(new ReplaceStrategy());

        String aaasdvsdvoisdnonewo = stringReplace.reduce("aaasdvsdvoisdnonewo");

        System.out.println("aaasdvsdvoisdnonewo ==> " + aaasdvsdvoisdnonewo);
    }


}