package leetcode.addTwoNumbers;


public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // 初始化结果头结点， p、q、point 为移动指针
        // 初始化进位为 0
        ListNode restHead = new ListNode(0);
        ListNode p = l1, q = l2, point = restHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p == null) ? 0 : p.val;
            int y = (q == null) ? 0 : q.val;
            int sum = x + y + carry;

            // 更新进位
            carry = sum / 10;
            // 结果指针后移
            point.next = new ListNode(sum % 10);
            point = point.next;

            // p、q 后移
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        // 把最后一个进位加上
        if (carry > 0) point.next = new ListNode(carry);

        return restHead.next;
    }
}
