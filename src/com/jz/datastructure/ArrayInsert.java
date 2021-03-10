package com.jz.datastructure;

import java.util.Arrays;

public class ArrayInsert {
    private int[] array;
    private int size;

    public ArrayInsert(int length) {
        this.array = new int[length];
        this.size = 0;
    }

    @Override
    public String toString() {
        return "ArrayInsert{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }

    private void insertElement(int index, int element) {
        //判断是否合法
        if (index < 0 || index > size) {
            return;
        }
        if (size >= array.length) {
            resizeArray();
        }
        //挪动数组后元素
        for (int i = size - 1; i >= index; i--) {
            array[i+ 1] = array[i];
        }
        array[index] = element;
        size++;
    }

    private void resizeArray() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }
    private int deleteElement(int index){
        if (index < 0 || index > size) {
            return -1;
        }
        int deleteElement = array[index];
        for (int i=index;i<size;i++){
            array[i] = array[i+1];
        }
        size--;
        return deleteElement;

    }
    public static void main(String[] args) {
        ArrayInsert arrayInsert = new ArrayInsert(4);
        arrayInsert.insertElement(0, 1);
        arrayInsert.insertElement(1, 2);
        arrayInsert.insertElement(2, 3);
        arrayInsert.insertElement(3, 100);
        arrayInsert.insertElement(1, 12);

        arrayInsert.deleteElement(4);
        System.out.println(arrayInsert);
    }
}
