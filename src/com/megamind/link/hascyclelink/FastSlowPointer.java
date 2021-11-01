package com.megamind.link.hascyclelink;

import com.megamind.link.ListNode;

public class FastSlowPointer {
    private FastSlowPointer() {
    }

    public static boolean hasCycle(ListNode head) {
        ListNode car = head;
        ListNode bike = head;
        while (car != null && car.next != null) {
            bike = bike.next;
            car = car.next.next;

            if (bike == car) {
                return true;
            }
        }
        return false;
    }
}
