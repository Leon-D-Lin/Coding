package com.test.alphabet;

import com.test.alphabet.strategy.ReductionStrategy;

/**
 * 字符串消除处理类（上下文），封装策略调用并加入输入校验。
 */
public class StringReducer {
    private final ReductionStrategy strategy;
    /**
     * 构造函数，注入消除策略。
     * @param strategy 具体消除逻辑策略
     */
    public StringReducer(ReductionStrategy strategy) {
        this.strategy = strategy;
    }
    /**
     * 对输入字符串执行处理前进行合法性校验，仅允许 a-z 或 A-Z 字母。
     * @param input 输入被处理的字符串
     * @return 处理后的字符串
     * @throws IllegalArgumentException 如果输入不合法
     */
    public String reduce(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("输入不能为空");
        }
        if (!input.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("输入必须仅包含英文字母 (a-zA-Z)");
        }

        return strategy.apply(input.toLowerCase()); // 转小写处理
    }
}
