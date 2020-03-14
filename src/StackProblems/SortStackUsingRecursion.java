package StackProblems;

import java.util.ListIterator;
import java.util.Stack;

public class SortStackUsingRecursion {

    static void sortedInsert(Stack<Integer> s, int x)
    {
if(s.isEmpty() || x>s.peek()){
    s.push(x);
}
else {
    int temp = s.pop();
    sortedInsert(s,x);
    s.push(temp);
}

    }

    public void sortStack(Stack<Integer> s)
    {
        if(!s.isEmpty()){
            int temp = s.pop();
            sortStack(s);
            sortedInsert(s,temp);
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
