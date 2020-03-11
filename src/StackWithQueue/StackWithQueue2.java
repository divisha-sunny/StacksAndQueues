package StackWithQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackWithQueue2 {
    Queue<Integer> queue1 = new LinkedList<Integer>();
    Queue<Integer> queue2 = new LinkedList<Integer>();

    public void push(int data){
        queue1.add(data);
    }
    public int pop(){
        if(queue1.isEmpty()){
            return -1;
        }
        while(queue1.size() != 1){
            queue2.add(queue1.remove());
        }
        int x = queue1.remove();
        Queue<Integer> q = queue1;
        queue1 = queue2;
        queue2 = q;
        return x;
    }
    }

