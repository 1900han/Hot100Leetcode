package com.megamind.hascyclelink;

import com.megamind.link.ListNode;

public class ReverseListHasCycle {

    private ReverseListHasCycle() {
    }

    private static ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = newHead;
            newHead = head;
            head = tmp;
        }
        return newHead;
    }

    public static boolean hasCycle(ListNode head) {
        ListNode rev = reverseList(head);
        if (head != null && head.next != null && rev == head) {
            return true;
        }
        return false;
    }
}
