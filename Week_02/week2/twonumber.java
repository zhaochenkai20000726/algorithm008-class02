package week2;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer > map = new HashMap<>();
        for ( int t = 0;i < nums.length;i++) {
               map.put(nums[i].i);
        }
        for (int i = 0;i < nums.length;i++) {
             int temp = target - nums[i];
             if (map.containsKey(temp ) && (map.get(temp) != i)) {
                 return new int[] {i,map.get(temp)};
             }
        }
        throw new IllegalArgumentException("No two sum solation");
    }
}

