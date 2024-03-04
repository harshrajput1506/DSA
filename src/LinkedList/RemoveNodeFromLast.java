package LinkedList;

public class RemoveNodeFromLast {
    public ListNode main(String[] args) {
        ListNode head = new ListNode(); //input
        int n = 0; //Node
        int len = 0;
        int i = 0, position = 0;
        ListNode temp = head;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        position = len-n-1;
        if(position==-1) return head.next;
        ListNode sec = head;
        while(i<position){
            sec = sec.next;
            i++;
        }
        sec.next = sec.next.next;
        return head;
    }
}
