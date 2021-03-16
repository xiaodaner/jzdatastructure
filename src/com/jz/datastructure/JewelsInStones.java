package com.jz.datastructure;

import org.junit.Test;

public class JewelsInStones {

    @Test
    public void testNum(){
        String jewels = "Aaabc";
        String stones = "adsbadxcseA";
        System.out.println(numJewelsInStones(jewels,stones));
    }
    public int numJewelsInStones(String jewels, String stones) {

        return stones.replaceAll("[^" + jewels + "]", "").length();



    }
}
