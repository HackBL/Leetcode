#### Solution #1:
1. 本题难点在于如何去重
2. 对数组进行排序
3. 遍历排序后的数组
    * 对于重复元素，跳过，避免出现重复解
    * 令左指针 lo = i + 1，右指针 hi = n − 1，当lo < hi 时，执行循环
      * 当 nums[i] + nums[lo] + nums[hi] == 0，得出一个解；执行循环，判断左界和右界是否和下一位置重复，去除重复解。并同时将 lo, hi 移到下一位置，寻找新的解
      * 若和小于 0，说明 nums[lo] 太小，lo 右移
      * 若和大于 0，说明 nums[hi] 太大，hi 左移

 
* 时间复杂度：![](http://latex.codecogs.com/gif.latex?O%28n%5E%7B2%7D%29)，数组排序 ![](http://latex.codecogs.com/gif.latex?O%28nlogn%29)，遍历数组 ![](http://latex.codecogs.com/gif.latex?O%28n%29)，双指针遍历 ![](http://latex.codecogs.com/gif.latex?O%28n%29)，总体 ![](http://latex.codecogs.com/gif.latex?O%28n%20logn%29%20&plus;%20O%28n%29%20*%20O%28n%29)，![](http://latex.codecogs.com/gif.latex?O%28n%5E%7B2%7D%29)
