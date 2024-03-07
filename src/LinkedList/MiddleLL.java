package LinkedList;

public class MiddleLL {
    public static void main(String[] args) {

        /*head = 1,2,3,4,5
        head = 1,2,3,4,5,6

        Brute Force -> find the length of LL
        -> if(len is odd)
         -> midIndex = (len/2)-1 else -> (len/2)+1
        -> traversing till midIndex return head.val
        */
        System.out.println(7/2);
    }

    public ListNode middleNode(ListNode head) {
        int len = len(head);
        int mid = 0;
        mid = (len/2);

        while (mid>0){
            head = head.next;
            mid--;
        }
        return head;
    }

    public int len(ListNode head){

        if(head==null) return 0;
        int count = 1;
        while (head.next!=null){
            head = head.next;
            count++;
        }
        return count;
    }

}
