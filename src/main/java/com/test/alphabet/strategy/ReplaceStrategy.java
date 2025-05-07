package com.test.alphabet.strategy;

public class ReplaceStrategy implements ReductionStrategy {

    @Override
    public String apply(String input) {
        boolean changed;
        do {
            StringBuilder sb = new StringBuilder();
            changed = false;
            for (int i = 0; i < input.length(); ) {
                int j = i;
                while (j < input.length() && input.charAt(j) == input.charAt(i)) {
                    j++;
                }
                int count = j - i;
                if (count >= 3) {
                    char prev = (char)(input.charAt(i) - 1);
                    if (prev != 96){
                        sb.append(prev);
                    }
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
