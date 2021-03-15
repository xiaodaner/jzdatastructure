package com.jz.datastructure.test;


public class MyLinkedList {
    private static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    private Node head;
    private Node last;
    private int size;

    public void insert(int data, int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("下标异常");
        }
        Node insertNode = new Node(data);
        if (size == 0) {
            head = insertNode;
            last = insertNode;
        } else if (index == 0) {
            insertNode.next = head;
            head = insertNode;
        } else if (index == size) {
            last.next = insertNode;
            last = insertNode;
        } else {
            Node prev = get(index - 1);
            insertNode.next = prev.next;
            prev.next = insertNode;
        }
        size++;

    }

    public Node get(int index) {
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }

    public Node delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("下标异常");
        }
        Node removedNode = null;
        if (index == 0) {
            removedNode = head;
            head = head.next;

        }else if(index == size - 1 ){
            Node temp = get(size-1);
            removedNode = temp.next;
            temp.next = null;
            last = temp;
        }else{
            Node prevNode = get(index-1);
            Node nextNode = prevNode.next.next;
            removedNode = prevNode.next;
            prevNode.next = nextNode;
        }
        size--;
        return removedNode;


    }
    public void output(){
        Node temp = head;
        for(int i = 0;i<size;i++){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList mt = new MyLinkedList();
        mt.insert(3,0);
        mt.insert(7,1);
        mt.insert(9,2);
        mt.insert(5,3);
        mt.insert(6,4);
        mt.delete(0);
        mt.output();
    }
}
