//Given the head of a linked list, remove the nᵗʰ node from the end of the list
//and return its head.
//
//
// Example 1:
//
//
//Input: head = [1,2,3,4,5], n = 2
//Output: [1,2,3,5]
//
//
// Example 2:
//
//
//Input: head = [1], n = 1
//Output: []
//
//
// Example 3:
//
//
//Input: head = [1,2], n = 1
//Output: [1]
//
//
//
// Constraints:
//
//
// The number of nodes in the list is sz.
// 1 <= sz <= 30
// 0 <= Node.val <= 100
// 1 <= n <= sz
//
//
//
// Follow up: Could you do this in one pass?
//
// Related Topics Linked List Two Pointers 👍 19798 👎 848
package cc.llcon.L19;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class L19 {
    public static void main(String[] args) {
        // 准備資料
        int[] nodes = new int[]{1, 2};
        ListNode head = LinkedListUtil.genLinkedList(nodes);
        int n = 2;

        // 原始资料
        log.info("原始List:{}\tn:{}", head, n);

        // 調用算法并打印
        log.info("修改后List:{}", Solution.removeNthFromEnd(head, n));

    }

}
