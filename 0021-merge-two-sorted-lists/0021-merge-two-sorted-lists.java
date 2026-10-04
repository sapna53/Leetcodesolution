class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode d = new ListNode(0), c = d;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                c.next = l1;
                l1 = l1.next;
            } else {
                c.next = l2;
                l2 = l2.next;
            }
            c = c.next;
        }

        c.next = l1 != null ? l1 : l2;
        return d.next;
    }
}