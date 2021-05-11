#### Solution #1:
* 双指针
* 第一个指针用于记录在数组中不重复的元素
* 第二个指针迭代数组
* 通过第二个指针，把所有的不重复的元素以此通过第一个指针添加到数组中
<img src="https://github.com/HackBL/Leetcode/blob/main/Array/26.%20Remove%20Duplicates%20from%20Sorted%20Array/img/1.png" width=20% height=20%>

```
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
```
* Time: O(n), n: 数组的元素个数
* Space: O(1)

#### Solution #2:
<img src="https://github.com/HackBL/Leetcode/blob/main/Array/26.%20Remove%20Duplicates%20from%20Sorted%20Array/img/2.png" width=20% height=20%>

* Time: O(n), n: 数组的元素个数
* Space: O(1)

