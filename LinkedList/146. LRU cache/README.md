#### Solution #1:
* 用到HashMap & Doubly Linkedlist
* 要求是get & put的时间复杂度为O(1):
  * HashMap用于put & get当前的key-value，时间复杂度:O(1)，
  * Doubly Linkedlist用于排序，删除当前node, 添加node到首位，时间复杂度:O(1)
* Time: O(1)
* Space: O(n)

