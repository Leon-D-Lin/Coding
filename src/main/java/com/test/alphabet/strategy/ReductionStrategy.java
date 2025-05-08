package com.test.alphabet.strategy;

/**
 * 字符串消除策略接口，定义统一的处理方法。
 */
public interface ReductionStrategy {

    /**
     * @param input 输入被处理的字符串
     * @return      处理后的字符串
     */
    String apply(String input);
}