package QueueWithStack;
import java.security.PublicKey;
import java.util.Stack;
public class QueueWithStack {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void costEnqueue(int data){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(data);
        while(!stack2.isEmpty())
        {
            stack1.push(stack2.pop());
        }
    }
    public int cheapDequeue(){
        if(stack1.isEmpty()){
            System.out.println("Q is Empty");
            System.exit(0);
        }
        return stack1.pop();
    }

    public void cheapEnqueue(int data){
        stack1.push(data);
    }
    public int costDequeue() {
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


