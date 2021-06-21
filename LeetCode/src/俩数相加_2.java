public class 俩数相加_2 {

    //  Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum, carry=0;
        ListNode head=null , foot =null;
        while (l1!=null||l2!=null){
            int n1 = l1 != null ? l1.val:0;
            int n2 = l2 != null ? l2.val:0;
            sum = n1 + n2 + carry;
            if(head ==null){
                head = foot = new ListNode(sum%10,null);
            }else{
                foot.next = new ListNode(sum%10,null);
                foot = foot.next;
            }
            carry = sum/10;
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        if(carry!=0){
            foot.next = new ListNode(carry);
        }
        return head;
    }
}

// 时间复杂度：O(max(m,n))其中 m 和 n 分别为两个链表的长度。我们要遍历两个链表的全部位置，而处理每个位置只需要 O(1) 的时间。
// 空间复杂度：O(1)。 注意返回值不计入空间复杂度
