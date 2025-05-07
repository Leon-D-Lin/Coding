package com.test.alphabet.strategy;

public class RemoveStrategy implements ReductionStrategy {

    @Override
    public String apply(String input) {
        boolean changed;
        do {
            StringBuilder sb = new StringBuilder();
            changed = false;
            for (int i = 0; i < input.length(); ) {
                int j = i;

                //计数器
                while (j < input.length() && input.charAt(j) == input.charAt(i)) {
                    j++;
                }
                //减去计数的起步位置
                int count = j - i;
                if (count >= 3) {
                    changed = true;
                } else {
                    sb.append(input, i, j);
                }
                i = j;
            }
            input = sb.toString();
        } while (changed);
        return input;
    }
}
