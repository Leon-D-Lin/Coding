package com.test.alphabet.strategy;


/**
 * 实现策略接口：删除三个及以上连续字符。
 */
public class RemoveStrategy implements ReductionStrategy {

    /**
     * @param input 输入被处理的字符串
     * @return      返回删除策略处理的字符串
     */
    @Override
    public String apply(String input) {
        boolean changed;
        do {
            StringBuilder sb = new StringBuilder();
            changed = false;

            //遍历字符
            for (int i = 0; i < input.length(); ) {
                int j = i;
                //计数器
                while (j < input.length() && input.charAt(j) == input.charAt(i)) {
                    j++;
                }
                //减去计数的起步位置
                int count = j - i;
                //如果连续字符>=3, 跳过
                if (count >= 3) {
                    changed = true;//改为有变化
                } else {
                    sb.append(input, i, j);
                }
                i = j;//改为j的位置,进入下一轮循环
            }
            input = sb.toString();
        } while (changed);
        return input;
    }
}
