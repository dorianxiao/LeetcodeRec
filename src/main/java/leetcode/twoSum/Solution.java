package leetcode.twoSum;

import java.util.HashMap;
import java.util.Map;


public class Solution {

    // 暴力法
    public int[] twoSum1(int[] nums, int target) {
        for (int x = 0; x<nums.length; x++) {
            for (int y = x+1; y<nums.length; y++) {
                if (nums[y] == target - nums[x]) {
                    return new int[] {x, y};
                }
            }
        }
        return new int[] {0, 0};
    }

    // 两次循环+哈希表
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        // 第一次循环存入哈希表
        for (int i = 0; i<nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i<nums.length; i++){
            int tmp = target - nums[i];
            if (map.containsKey(tmp) && map.get(tmp) != i){ // 第二个布尔判断索引是否一样
                return new int[] {i, map.get(tmp)};
            }
        }
        return new int[] {0, 0};
    }

    // 一次循环+哈希表
    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            if (map.containsKey(tmp)) {
                return new int[] {map.get(tmp), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {0, 0};
    }
}