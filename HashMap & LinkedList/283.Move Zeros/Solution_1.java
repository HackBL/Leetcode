class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return;
        
        int i = 0, j = 1;
        
        while (j < nums.length) {
            if (nums[i] == 0 && nums[j] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++; j++;
            } else if (nums[i] == 0 && nums[j] == 0) {
                j++;
            } else {
                i++; j++;
            }
            
        }
    }
}