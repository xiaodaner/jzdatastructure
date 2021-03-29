package com.jz.datastructure;

import org.junit.Test;

public class LinkedListIsCycle {
    private static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    public boolean isCycle(Node head) {
        Node p1 = head;//每次步进1
        Node p2 = head;//每次步进2
        while (p2 != null && p2.next != null) {//用快的去判断
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void test() {
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);
        Node node6 = new Node(7);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node3;
        System.out.println(isCycle(node1));

    }
}
