/**定义两个变量fast,low. fast每次走两步，low每次走一步。
*当fast与low相遇时，说明有环
*/
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast=head;
        while (fast !=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast==slow){
                return true;
            }
        }
        return false;
    }
}
