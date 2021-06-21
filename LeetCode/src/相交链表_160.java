import java.util.HashMap;
import java.util.HashSet;

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class 相交链表_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hashSet = new HashSet<>();
        while (headA != null){
            hashSet.add(headA);
            headA = headA.next;
        }
        while(headB!=null){
            if(hashSet.contains(headB)){
                return  headB;
            }
            headB = headB.next;
        }
        return null;
    }
}

//时间复杂度 : O(m+n)
//空间复杂度 : O(m) 或 O(n)
