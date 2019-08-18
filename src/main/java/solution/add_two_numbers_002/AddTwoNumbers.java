package solution.add_two_numbers_002;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode ret = null;
        ListNode p = null;
        while (l1 != null || l2 != null) {
            ListNode l = null;
            if (p != null) {
                l = p.next;
                if (l == null) {
                    l = new ListNode(0);
                }
                p.next = l;
                p = p.next;
            } else {
                l = new ListNode(0);
                p = l;

            }

            if (ret == null) {
                ret = l;
            }


            int val1 = 0;
            int val2 = 0;
            if (l1 != null) {
                val1 = l1.val;
            }
            if (l2 != null) {
                val2 = l2.val;
            }

            l.val = val1 + val2 + l.val;
            if (l.val >= 10) {
                l.val = l.val % 10;
                l = new ListNode(1);
                p.next = l;
            } else {
                carry = 0;
            }

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return ret;

    }

    public static void main(String[] args) {

    }

}


