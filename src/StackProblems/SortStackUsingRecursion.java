package StackProblems;

import java.util.ListIterator;
import java.util.Stack;

public class SortStackUsingRecursion {

    public void sortStack(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int temp = s.pop();
            sortStack(s);
            sortedInsert(s, temp);
        }
    }
     public void sortedInsert(Stack<Integer> s, int temp){
        if(s.isEmpty() || temp>s.peek()){
            s.push(temp);
            return;
        }
        else{
         int tempS = s.pop();
         sortedInsert(s, tempS);
         s.push(tempS);
        }
    }
    public void printStack(Stack<Integer> stack){
        ListIterator<Integer> lt = stack.listIterator();
        while(lt.hasNext())
            lt.next();
        while(lt.hasPrevious())
            System.out.print(lt.previous()+" ");
    }
}
