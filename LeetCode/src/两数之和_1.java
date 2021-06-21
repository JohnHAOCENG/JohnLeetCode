import java.util.HashMap;

public class 两数之和_1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hashMap.containsKey(target-nums[i])){
                return new int[]{hashMap.get(target-nums[i]),i};
            }
            hashMap.put(nums[i],i);
        }
        return new int[0];
    }
}

// 时间o（N） 空间o（N）