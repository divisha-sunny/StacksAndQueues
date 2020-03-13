package StackProblems;

import java.util.ListIterator;
import java.util.Stack;

public class SortStackUsingRecursion {

    static void sortedInsert(Stack<Integer> s, int x)
    {
        // Base case: Either stack is empty or newly inserted
        // item is greater than top (more than all existing)
        if (s.isEmpty() || x > s.peek())
        {
            s.push(x);
            return;
        }

        // If top is greater, remove the top item and recur
        int temp = s.pop();
        sortedInsert(s, x);

        // Put back the top item removed earlier
        s.push(temp);
    }

    // Method to sort stack
    public void sortStack(Stack<Integer> s)
    {
        // If stack is not empty
        if (!s.isEmpty())
        {
            // Remove the top item
            int x = s.pop();

            // Sort remaining stack
            sortStack(s);

            // Push the top item back in sorted stack
            sortedInsert(s, x);
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
