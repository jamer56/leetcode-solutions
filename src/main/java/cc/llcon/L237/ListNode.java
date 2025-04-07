package cc.llcon.L237;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
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
