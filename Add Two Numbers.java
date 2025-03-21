/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode listNodeA, ListNode listNodeB) {
        ListNode rootNode = null;
        ListNode currentNode = null;

        int remainder = 0;
        while (listNodeA != null || listNodeB != null) {
            int sum = remainder;

            if (listNodeA != null) {
                sum += listNodeA.val;
                listNodeA = listNodeA.next;
            }

            if (listNodeB != null) {
                sum += listNodeB.val;
                listNodeB = listNodeB.next;
            }

            remainder = sum / 10;
            sum %= 10;

            if (rootNode == null) {
                rootNode = new ListNode(sum);
                currentNode = rootNode;
            } else {
                currentNode.next = new ListNode(sum);
                currentNode = currentNode.next;
            }
        }

        while (remainder > 0) {
            int sum = remainder;

            remainder = sum / 10;
            sum %= 10;

            currentNode.next = new ListNode(sum);
            currentNode = currentNode.next;
        }

        return rootNode;
    }
}
