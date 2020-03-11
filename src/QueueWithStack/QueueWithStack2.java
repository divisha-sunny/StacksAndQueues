package QueueWithStack;

import java.util.Stack;

public class QueueWithStack2 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void Enqueue(int data){
        stack1.push(data);
    }
    public int Dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Q is Empty");
            System.exit(0);
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
