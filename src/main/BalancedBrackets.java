package main;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets_old(String str) {
        int brackets = 0;
        for (char ch : str.toCharArray()) {
            if(ch == ']' && brackets == 0) return false;
            brackets += (ch == '[')? 1 : (ch == ']')? -1 : 0;
        }
        return brackets == 0;
    }
    public static boolean hasBalancedBrackets(String str) {
        boolean isBalanced = false;
        AtomicInteger brackets = new AtomicInteger(0);
        str.chars().mapToObj(ch -> Character.valueOf((char) ch)).forEach(ch -> {
            if(ch.equals(']') && brackets.get() == 0) { return; }
            brackets.addAndGet((ch.equals('['))? 1 : (ch.equals(']'))? -1 : 0);
        });
        isBalanced = brackets.get() == 0;
        return isBalanced;
    }

}
