/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode ret = null;
        ListNode p = null;
        while(l1 != null || l2 != null){
            ListNode l = null;
            if(p != null){
                l = p.next;
                if(l == null){
                    l = new ListNode(0);
                }
                p.next = l;
                p = p.next;
            }else{
                l = new ListNode(0);
                p = l;
                
            }
            
            if(ret == null){
                ret = l;
            }
            
            
            int val1 = 0;
            int val2 = 0;
            if(l1 != null){
                val1 = l1.val;
            }
            if(l2 != null){
                val2 = l2.val;
            }
            
            l.val = val1 + val2 + l.val;;
            if(l.val >= 10){
                l.val = l.val % 10;
                l = new ListNode(1);
                p.next = l;
            }else{
                carry = 0;
            }
            
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        return ret;
        
    }
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode ret = new ListNode(0);
        ListNode p = ret;
        while(p1 != null || p2 != null){
            sum /= 10;
            
            if(p1 != null){
                sum += p1.val;
                p1 = p1.next;
            }
            if(p2 != null){
                sum += p2.val;
                p2 = p2.next;
            }
            
            p.next = new ListNode(sum%10);
            p = p.next;
        }
        
        if(sum >= 10){
            p.next = new ListNode(sum/10);
        }
        
        return ret.next;
    }
}