package com.megamind.hascyclelink;

import com.megamind.link.ListNode;

import java.util.HashSet;

public class HashSetHasCycle {
    private HashSetHasCycle() {
    }

    public static boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
