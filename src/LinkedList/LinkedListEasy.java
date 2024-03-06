package LinkedList;

public class LinkedListEasy {
    public static void main(String[] args) {

    }

    // Linked List Cycle
    public boolean hasCycle(ListNode head) {

        // We are using slow and fast pointers approach
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;

    }
}
