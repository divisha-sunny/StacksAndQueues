package StackProblems;

import java.util.ListIterator;
import java.util.Stack;

public class SortStackUsingAnotherStack {
    public Stack<Integer> sortStacks(Stack<Integer> input) {
        Stack<Integer> tempStack = new Stack<Integer>();
        while (!input.isEmpty()) {
            int temp = input.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                input.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        return tempStack;
    }

    public void printStack(Stack<Integer> stack) {
        while (!stack.empty())
        {
            System.out.print(stack.pop()+" ");
        }
    }
}