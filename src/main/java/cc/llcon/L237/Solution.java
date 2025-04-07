package cc.llcon.L237;

public class Solution {
    public static void deleteNode(ListNode node, ListNode head) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
