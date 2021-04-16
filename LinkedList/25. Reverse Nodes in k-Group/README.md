#### Solution #1:
<img src="https://github.com/HackBL/Leetcode/blob/main/LinkedList/25.%20Reverse%20Nodes%20in%20k-Group/img/1.png" width=40% height=40%>

* Time: O(n), we split the linkedlist to chunks by k, each chunk has been done by reverse. The traverse will be n nodes. 
* Space: O(1)


#### Solution #2:
* Recursive
* 找出 k+1 的node，作为当前k组的下一个起点node
* 递归，直到最后一个
* 递归后，开始in-place操作linkedlist
* Time: O(n)
* Space: O(n/k), k chunks to be reversed in linkedlist, there're n/k recursions meaning that taking O(n/k) space memory by stack.
