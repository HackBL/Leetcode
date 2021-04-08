#### Solution #1 (快慢指针):
<img src="https://github.com/HackBL/Leetcode/blob/main/LinkedList/142.%20Linked%20List%20Cycle%20II/img/1.gif" width=50% height=50%>

* Time: O(n)
* Space: O(1)

#### Solution #2 (哈希):
* Set存每一个node
* 一旦当前的node在Set中存在过，这个node就是循环的起点
* Time: O(n)
* Space: O(n)
