import Node.ListNode;

/**
 * 2. Add Two Numbers
 *
 * Created by perl on 2019/7/5.
 *
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *
 * Output: 7 -> 0 -> 8
 *
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode fakeHead = new ListNode(-1);
        ListNode current = fakeHead;
        int carry = 0;
        while( l1 != null || l2 != null ) {
            int val = l1 == null ? 0 : l1.val;
            val += l2 == null ? 0 : l2.val;
            val += carry;
            carry = val / 10;
            val %= 10;
            current.next = new ListNode(val);
            current = current.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if( carry == 1 ){
            current.next = new ListNode(carry);
        }
        return fakeHead.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));
        ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4)));
        ListNode l3 = addTwoNumbers(l1,l2);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
}
