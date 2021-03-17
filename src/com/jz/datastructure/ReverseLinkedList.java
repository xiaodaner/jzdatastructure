package com.jz.datastructure;

import org.junit.Test;

public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        System.out.println(prev.val);
        return prev;
    }

    @Test
    public void testReverseList(){
        ListNode listNode = new ListNode(1);
        ListNode head = listNode;
        for(int i=2;i<6;i++){
            ListNode newlist =  new ListNode(i);
            listNode.next = newlist;
            listNode = newlist;
        }
        reverseList(head);


    }

}
