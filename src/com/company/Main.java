package com.company;

import QueueWithStack.QueueWithStack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        QueueWithStack q = new QueueWithStack();
        q.cheapEnqueue(5);
        q.cheapEnqueue(6);
        q.cheapEnqueue(9);
        System.out.println(q.costDequeue());
        System.out.println(q.costDequeue());
        System.out.println(q.costDequeue());
        q.cheapEnqueue(1);
        q.cheapEnqueue(21);
        System.out.println(q.costDequeue());
        System.out.println(q.costDequeue());
        System.out.println(q.costDequeue());
    }
}
