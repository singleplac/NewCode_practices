// 先让变量p前进k步之后，
// 变量w与p同步遍历，p遍历到头后w也到头了
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param pHead ListNode类
     * @param k int整型
     * @return ListNode类
     */
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here

        int len = 0;
        ListNode p = pHead,w = pHead;
        while (p != null ){
            p = p.next;
           len ++;
        }
        if (k>len || k==0){
            return null;
        }
        int i =0;
        p = pHead;
        while (p != null && i < k){
            p = p.next;
            i++;
        }
//         System.out.print("p.val = "+p.val + "\n");
        while (p!=null && w!=null){
            p=p.next;
            w = w.next;
        }
        return w;
    }
}
