// 先让两个链表以最后一个为基准对齐
// 遍历直到值相等
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int len1 = 0, len2 = 0;
        ListNode p1 = pHead1,p2=pHead2;
        if (pHead1==null||pHead2==null){
            return null;
        }
        while (p1!= null){
            len1++;
            p1 = p1.next;
        }
        while (p2!= null){
            len2++;
            p2 = p2.next;
        }
        System.out.print("len1 = " + len1  + " len2 = " + len2 + "\n");
        int longer = len1 > len2 ? len1: len2;
        int shoter = len1 > len2 ? len2: len1;
        ListNode w1 = pHead1,w2=pHead2;
        int i=0;
        while (i<longer-shoter){
            if (longer==len1){
                w1 = w1.next;
            }else{
                w2 = w2.next;
            }
            i++;
        }
        System.out.print("w1 = " + w1.val + " w2 = " + w2.val);
        while (w1!=null &&w2!=null){
            if (w1.val ==w2.val){
                return w1;
            }else{
                w1 = w1.next;
                w2 = w2.next;
            }

        }
        return null;
    }
}
