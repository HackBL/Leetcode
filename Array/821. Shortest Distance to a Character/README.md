* 思路：先正序，再倒序
正序：所有在s中的元素（除了c元素），以其左边的c为参照物，求出距离，并存在answer中。若元素的左边没有参照物c，则存入string.length()与当前index的差值。
倒序：所有在s中的元素（除了c元素），以其右边的c为参照物，求出最小距离（min(answer[o], pos-1)），并存在answer中。
若当前元素为c，answer当前index的元素为0
```
class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int pos = -n;
        int[] answer = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) pos = i;
            answer[i] = i - pos;
        }
        
        for (int i = pos; i >= 0; i--) {
            if (s.charAt(i) == c) pos = i;
            answer[i] = Math.min(answer[i], pos - i);
        }
        
        return answer;
    }
}
```
* 时间：O(n)， n为s的长度
* 空间：O(n)， 建立新数组answer，长度为n