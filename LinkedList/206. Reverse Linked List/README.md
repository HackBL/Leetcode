#### Solution #1 (迭代):
* 在遍历时，将当前node的next指向前一个元素
* 提前记录当前node的next
* head和当前指针同时指向各自的下一个
* 返回最后一个node
* Time: O(n), number of nodes
* Space: O(1)

#### Solution #2 (递归):
* 记录两个node，当前节点和prev节点
* 提前记录next节点
* 当前节点的next指向prev节点
* prev和当前节点同时指向各自的下一个
* 进行递归，传入新的当前节点和prev节点，并且返回
* Time: O(n)
* Space: O(n), 由于使用递归，将会使用隐式栈空间。递归深度可能会达到 n 层。

#### Solution #3 (递归):
* 递归进行记录下一个节点，直到最后一个
* 在递归到最后一个节点时，返回的是其前一个节点
* 当前节点的下一个指向前一个节点
* 前一个节点的下一个指向null
* 返回最后一个节点即可
* Time: O(n)
* Space: O(n)
