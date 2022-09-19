package deleteDuplicates;

public class deleteDuplicates {
    public ListNode DeleteDuplicates(ListNode head) {
    if(head == null || head.next == null){
            return head;
        }
        head.next = DeleteDuplicates(head.next);
        if(head.val == head.next.val) head = head.next;
        return head;
    }
}
