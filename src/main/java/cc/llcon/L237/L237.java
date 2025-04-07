//There is a singly-linked list head and we want to delete a node node in it.
//
// You are given the node to be deleted node. You will not be given access to
//the first node of head.
//
// All the values of the linked list are unique, and it is guaranteed that the
//given node node is not the last node in the linked list.
//
// Delete the given node. Note that by deleting the node, we do not mean
//removing it from memory. We mean:
//
//
// The value of the given node should not exist in the linked list.
// The number of nodes in the linked list should decrease by one.
// All the values before node should be in the same order.
// All the values after node should be in the same order.
//
//
// Custom testing:
//
//
// For the input, you should provide the entire linked list head and the node
//to be given node. node should not be the last node of the list and should be an
//actual node in the list.
// We will build the linked list and pass the node to your function.
// The output will be the entire list after calling your function.
//
//
//
// Example 1:
//
//
//Input: head = [4,5,1,9], node = 5
//Output: [4,1,9]
//Explanation: You are given the second node with value 5, the linked list
//should become 4 -> 1 -> 9 after calling your function.
//
//
// Example 2:
//
//
//Input: head = [4,5,1,9], node = 1
//Output: [4,5,9]
//Explanation: You are given the third node with value 1, the linked list
//should become 4 -> 5 -> 9 after calling your function.
//
//
//
// Constraints:
//
//
// The number of the nodes in the given list is in the range [2, 1000].
// -1000 <= Node.val <= 1000
// The value of each node in the list is unique.
// The node to be deleted is in the list and is not a tail node.
//
//
// Related Topics Linked List 👍 5586 👎 1673
package cc.llcon.L237;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class L237 {
    public static void main(String[] args) {
        // 準備資料
        // 创建Linked list
        int[] nodes = new int[]{4, 5, 1, 9};
        ListNode head = LinkedListUtil.genLinkedList(nodes);
        // 尋找鏈表中的元素
        ListNode node = LinkedListUtil.getByValue(head, 5);

        // 打印鏈表
        log.info("原始鏈錶 : {}", head.toString());

        // 調用算法
        if (node == null) {
            log.warn("链表中找不到目标Node");
            return;
        }
        Solution.deleteNode(node, head);

        // 打印修改后的鏈表
        log.info("修改後的鏈錶 : {}", head.toString());
    }
}