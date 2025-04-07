package cc.llcon.L19;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[').append(this.val);
        ListNode tmp = this.next;
        while (tmp != null) {
            stringBuilder.append(" -> ").append(tmp.val);
            tmp = tmp.next;
        }
        stringBuilder.append(']').append("@").append(Integer.toHexString(hashCode()));
        return stringBuilder.toString();
    }
}
