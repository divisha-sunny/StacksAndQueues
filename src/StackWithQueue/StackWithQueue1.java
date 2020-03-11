package StackWithQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackWithQueue1 {

    Queue<Integer> queue1 = new LinkedList<Integer>();
    Queue<Integer> queue2 = new LinkedList<Integer>();
    public void push(int data){
        queue2.add(data);
        while(!queue1.isEmpty()){
            queue2.add(queue1.remove());
        }
        Queue<Integer> q = queue1;
        queue1 = queue2;
        queue2 = q;
    }
    public int pop(){
        if(queue1.isEmpty()){
            return 0;
        }
        return queue1.remove();
    }
}
