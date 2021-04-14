class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length == 0) return;
        k %= nums.length;
        int idx = nums.length-1;
        int[] res = new int[nums.length];
        
        for (int i = nums.length-1; i >= 0; i--) {
            if (k > 0) {
                res[--k] = nums[i];
            } else {
                res[idx--] = nums[i];
            }
        }
        
        for (int i = 0; i < nums.length; i++)
            nums[i] = res[i];
    }
}