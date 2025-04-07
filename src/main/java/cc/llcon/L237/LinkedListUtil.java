/**
 * 鏈錶工具類
 */
package cc.llcon.L237;

public class LinkedListUtil {
    /**
     * 创建链表
     *
     * @param nodes 整数数组 链表中的值
     * @return 链表的头结点
     */
    public static ListNode genLinkedList(int[] nodes) {
        ListNode head = new ListNode(nodes[0]);
        ListNode tmp = head;
        for (int i = 1; i < nodes.length; i++) {
            tmp.next = new ListNode(nodes[i]);
            tmp = tmp.next;
        }

        return head;
    }

    /**
     * 在给定的链表中寻找Node
     *
     * @param head 头结点
     * @param val  寻找的值
     * @return 如果值存在返回 目标Node 不存在返回 null
     */
    public static ListNode getByValue(ListNode head, int val) {
        while (head.val != val) {
            if (head.next == null) {
                return null;
            }
            head = head.next;
        }

        return head;
    }
}
