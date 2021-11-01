package com.megamind.mergetwolists;

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
                dummyHead.next = l1;
                l1 = l1.next;
            } else {
                dummyHead.next = l2;
                l2 = l2.next;
            }
            dummyHead = dummyHead.next;
        }
        dummyHead.next = (l1 == null ? l2 : l1);
        return result.next;
    }


}
