#### Solution #1:
* 1 2 3 4 5 6 7
* 7 6 5 4 3 2 1
* 5 6 7 4 3 2 1
* 5 6 7 1 2 3 4 --> Result
```
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}
```
* Time: O(n), n: elements are reversed a total of three times.
* Space: O(1)

#### Solution #2:
<img src="https://github.com/HackBL/Leetcode/blob/main/Array/189.%20rotate%20array/img/2.png" width=30% height=30%>
```
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
```
* Time: O(n)
* Space: O(n)

