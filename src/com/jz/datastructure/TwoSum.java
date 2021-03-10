package com.jz.datastructure;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum (int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = target-nums[i];
            if(map.containsKey(num)){
                return new int[]{map.get(num),i};
            }
            map.put(nums[i],i);
        }
       return new int[0];
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,9,11};
        int target = 16;
        int[] arr = twoSum(nums,target);
        System.out.println(arr[0]+","+arr[1]);
    }
}
