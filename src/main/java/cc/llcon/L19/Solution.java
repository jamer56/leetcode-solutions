package cc.llcon.L19;

import java.util.Stack;

class Solution {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        Stack<ListNode> stack = new Stack<>();
        ListNode tmp = head;

        while (tmp.next != null) {
            stack.push(tmp);
            tmp = tmp.next;
        }
        stack.push(tmp);

        for (int i = 0; i < n; i++) {
            tmp = stack.pop();
        }

        // 判断是否为头结点
        if (tmp == head) {
            return head.next;
        }

        // 判断是否为最后一个元素
        if (tmp.next == null) {
            tmp = stack.pop();
            tmp.next = null;
        } else {
            tmp.val = tmp.next.val;
            tmp.next = tmp.next.next;
        }

        return head;
    }
}