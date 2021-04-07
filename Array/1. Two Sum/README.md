#### Solution:
* HashMap记录所有和当前元素相加不等于target的元素
* 如果当前的元素和记录在HashMap中任意一个元素相加等于target，返回他们的indices
* Time: O(N)
* Space: O(N)
