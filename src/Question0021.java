import java.util.List;

public class Question0021 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode current = head;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val){
                current.next = new ListNode(list2.val);
                list2 = list2.next;
                current = current.next;
            }else {
                current.next = new ListNode(list1.val);
                list1 = list1.next;
                current = current.next;
            }
        }
        if (list1 == null){
            current.next = list2;
        }else{
            current.next = list1;
        }
        head = head.next;
        return head;
    }

}

