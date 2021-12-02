import java.util.ArrayList;
import java.util.Collections;
public class Solution {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        while (listNode!=null){
            arr.add(listNode.val);
            listNode = listNode.next;
        }
                  System.out.println("反转前排序: " + arr);            
          Collections.reverse(arr);
          System.out.println("反转后排序: " + arr);
        return arr;

    }
}
