#### Solution #1 （双指针）:
* 用一句话概括双指针解法要点：**指针每移动一次，意味着排除掉了一个柱子**
* 在一开始，我们考虑距离最远的两根柱子所能容纳水的面积，宽度：index之差，高度：两根柱子之间较短的一个，面积：宽x高
* 当柱子是最两侧的柱子，宽度最大，其他组合的宽度都比这个小
* 左边的高度较短，决定了水的高度，如果移动左边的柱子，新的水面高度不再确定，但一定不超过右边的高度
* 如果移动右边的柱子，新的水面高度一定不超过左边柱子的高度
<img src="https://github.com/HackBL/Leetcode/blob/main/Array/11.%20Container%20With%20Most%20Water/img/1.png" width=70% height=70%>
* 由此可见，如果固定左边柱子，移动右边柱子，水的高度不但不会增加，水的宽度还会减少，整体面积就会变小
<img src="https://github.com/HackBL/Leetcode/blob/main/Array/11.%20Container%20With%20Most%20Water/img/2.png" width=70% height=70%>

* 所以，每次要移动矮的柱子，才会把所有可能的面积全部找出来
* 最终，通过Math.max方法，得出最大的面积即可
* Time: O(n)， n: array.length
* Space: O(1)

