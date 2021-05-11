#### Solution:
* HashMap记录所有和当前元素相加不等于target的元素
* 如果当前的元素和记录在HashMap中任意一个元素相加等于target，返回他们的indices
```
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                return res;
            }
            map.put(nums[i], i);
        }
        
        return res;
    }
}
```
* Time: O(N)
* Space: O(N)
