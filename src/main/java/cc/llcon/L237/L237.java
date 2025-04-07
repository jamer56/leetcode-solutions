package cc.llcon.L237;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
        Solution.deleteNode(node,head);

        // 打印修改后的鏈表
        log.info("修改後的鏈錶 : {}", head.toString());
    }
}