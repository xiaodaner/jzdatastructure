package com.jz.datastructure;

import org.junit.Test;

public class reverseString {
    public void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
    }
    @Test
    public void test(){
        String testString = "hello11";
        char[] chars = testString.toCharArray();
        reverseString(chars);
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
    }
}
