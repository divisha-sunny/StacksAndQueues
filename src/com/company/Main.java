package com.company;
import QueueWithStack.QueueWithStack1;
import QueueWithStack.QueueWithStack2;
import StackProblems.BalancedParenthesis;
import StackProblems.SortStackUsingAnotherStack;
import StackProblems.SortStackUsingRecursion;
import StackWithQueue.StackWithQueue1;

import java.sql.SQLOutput;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        QueueWithStack1 q1 = new QueueWithStack1();
        QueueWithStack2 q2 = new QueueWithStack2();
        StackWithQueue1 s1 = new StackWithQueue1();
        StackWithQueue1 s2 = new StackWithQueue1();
        BalancedParenthesis bp = new BalancedParenthesis();
        SortStackUsingRecursion r = new SortStackUsingRecursion();
        SortStackUsingAnotherStack an = new SortStackUsingAnotherStack();
       /* q1.Enqueue(5);
        q1.Enqueue(6);
        q1.Enqueue(9);
        System.out.println(q1.Dequeue());
        System.out.println(q1.Dequeue());
        System.out.println(q1.Dequeue());
        q1.Enqueue(1);
        q1.Enqueue(21);
        System.out.println(q1.Dequeue());
        System.out.println(q1.Dequeue());
        System.out.println(q1.Dequeue());
        q2.Enqueue(8);
        q2.Enqueue(28);
        q2.Enqueue(7);
        System.out.println(q2.Dequeue());
        System.out.println(q2.Dequeue());
        System.out.println(q2.Dequeue());
        q2.Enqueue(31);
        q2.Enqueue(10);
        System.out.println(q2.Dequeue());
        System.out.println(q2.Dequeue());
        System.out.println(q2.Dequeue());*/
       /*s1.push(1);
       s1.push(2);
       s1.push(3);
       s1.push(4);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        s2.push(5);
        s2.push(6);
        s2.push(7);
        s2.push(8);
        System.out.println(s2.pop());
        System.out.println(s2.pop());
        System.out.println(s2.pop());
        System.out.println(s2.pop());*/
       /*char exp[] = {'{','(',')','}','[','}'};
       if(bp.areParenthesisBalanced(exp)){
           System.out.println("Balanced");
       }
       else
           System.out.println("Not Balanced");
    }*/
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);
        System.out.println("Stack elements before sorting:");
        r.printStack(stack);
        an.sortStacks(stack);
        System.out.println("After sorting:");
        an.printStack(stack);
    }
}
