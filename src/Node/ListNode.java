package Node;

/**
 * Created by perl on 2019/7/5.
 * @Desc Aefinition for singly-linked list
 */
public class ListNode {
    Integer val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append(val);
        ListNode nextNode = next;
        while (nextNode != null) {
            sb.append(" -> ").append(nextNode.val);
            nextNode = nextNode.next;
        }

        return sb.toString();
    }
}
