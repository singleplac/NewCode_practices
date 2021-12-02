// 链表头到环入口的距离=相遇点到环入口的距离+（k-1）圈数环长度
//low从链表头出发，fast从相遇点出发，以相同速度遍历最终一定在入口处相遇
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode low=pHead, fast = pHead;
        while (fast.next!=null && fast.next.next!=null){
               fast = fast.next.next;
               low = low.next;
            if (fast.val == low.val){
               break;
            }

        }
//         没有环
        if (fast.next==null || fast.next.next==null){
            return null;
        }
        low = pHead;
        while (low!=fast){
            low = low.next;
            fast = fast.next;
        }
        return fast;

    }
}
