class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;
        
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i-1])
                nums[idx++] = nums[i];
        }
        
        return idx;
    }
}