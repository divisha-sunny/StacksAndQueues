package QueueWithStack;
import java.util.Stack;
public class QueueWithStack1 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void Enqueue(int data){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(data);
        while(!stack2.isEmpty())
        {
            stack1.push(stack2.pop());
        }
    }
    public int Dequeue(){
        if(stack1.isEmpty()){
            System.out.println("Q is Empty");
            System.exit(0);
        }
        return stack1.pop();
    }

}


