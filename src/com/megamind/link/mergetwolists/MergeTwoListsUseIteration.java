package com.megamind.link.mergetwolists;

import com.megamind.link.ListNode;

public class MergeTwoListsUseIteration {
    public MergeTwoListsUseIteration() {
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        ListNode dummyHead = new ListNode();
        ListNode result = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                result.next = l1;
                l1 = l1.next;
            } else {
                result.next = l2;
                l2 = l2.next;
            }
            result = result.next;
        }
        result.next = (l1 == null ? l2 : l1);
        return dummyHead.next;
    }


}
