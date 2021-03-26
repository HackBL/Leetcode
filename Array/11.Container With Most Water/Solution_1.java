class Solution {
    public int maxArea(int[] height) {
        int lo = 0, hi = height.length-1;
        int max = 0;
        
        while (lo < hi) {
            int h = Math.min(height[lo], height[hi]);
            int w = hi - lo;
            max = Math.max(max, h * w);
            
            if (height[lo] < height[hi]) lo++;
            else hi--;
        }
        
        return max;
    }
}