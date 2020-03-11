package StackProblems;

import java.util.Stack;

public class BalancedParenthesis {
    Stack<Character> st = new Stack<Character>();

    public boolean MatchingParenthesis(char character1, char character2) {
        if (character1 == '(' && character2 == ')') {
            return true;
        } else if (character1 == '{' && character2 == '}') {
            return true;
        } else if (character1 == '[' && character2 == ']') {
            return true;
        } else
            return false;
    }

    public boolean areParenthesisBalanced(char arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '{' || arr[i] == '(' || arr[i] == '[') {
                st.push(arr[i]);
            }
            if (arr[i] == ')' || arr[i] == '}' || arr[i] == ']') {
                if (st.isEmpty()) {
                    return false;
                } else if (!MatchingParenthesis(st.pop(), arr[i])) {
                    return false;
                }

            }
        }
        if(st.isEmpty()){
            return true;
        }
        else return false;
    }
}


