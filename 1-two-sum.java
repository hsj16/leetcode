public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2]; 
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                }
            }
        }
        
        return ret;
    }
}

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[]{0,0}; 
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                ret[0] = map.get(target - nums[i]);
                ret[1] = i;
                return ret;
            }
            map.put(nums[i],i);
        }
        
        return ret;
    }
}