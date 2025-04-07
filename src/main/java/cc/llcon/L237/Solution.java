package cc.llcon.L237;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Solution {
    public static void deleteNode(ListNode node,ListNode head) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
