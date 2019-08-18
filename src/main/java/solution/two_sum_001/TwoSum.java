package solution.two_sum_001;


import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    /**
     * bruteforce n^2 复杂度
     */
    public int[] twoSum1(int[] nums, int target) {
        int[] ret = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                }
            }
        }

        return ret;
    }


    /**
     * map n 复杂度
     */
    public int[] twoSum2(int[] nums, int target) {
        int[] ret = new int[]{0, 0};
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                ret[0] = map.get(target - nums[i]);
                ret[1] = i;
                return ret;
            }
            map.put(nums[i], i);
        }

        return ret;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] ret = new TwoSum().twoSum1(nums, 9);
        for (int i : ret) {
            System.out.println(i);
        }
        System.out.println("");
        ret = new TwoSum().twoSum2(nums, 9);
        for (int i : ret) {
            System.out.println(i);
        }
    }
}