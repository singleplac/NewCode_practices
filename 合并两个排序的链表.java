public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1==null){
            return list2;
        }
        if (list2 ==null){
            return list1;
        }
        ListNode head = null,p = null;
        while (list1!=null && list2 !=null){
            if(list1.val<=list2.val){
                if (p==null){
                    head = p = list1;
                }else{
                    p.next = list1;
                    p = p.next;
                }
                list1 = list1.next;
            }else{
                if(p==null){
                    head = p = list2;
                }else{
                    p.next = list2;
                    p =p.next;
                }
                list2 = list2.next;
            }
        }
        if (list1==null){
            p.next = list2;
        }else{
            p.next  = list1;
        }
        return head;
    }
}
