package com.test.alphabet.strategy;

public class ReplaceStrategy implements ReductionStrategy {

    /**
     * 每轮替换连续的三个或更多字符为其前一个字母，直到无法再替换。
     * @param input 输入被处理的字符串
     * @return      返回替换策略处理的字符串
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
                int count = j - i;
                //如果连续字符>=3, 执行替换
                if (count >= 3) {
                    char prev = (char)(input.charAt(i) - 1);
                    if (prev != 96){//如果不是变成a的前一个`字符,添加替换字符
                        sb.append(prev);
                    }
                    changed = true;
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
