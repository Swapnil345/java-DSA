package StackAndQueueQuestions;

import java.util.Stack;

public class ValidParenthesisCount {
    static class Solution{
        Stack<Character> stack = new Stack<>();
        public int minParenthesisAdd(String s){
            for(char ch:s.toCharArray()){
                if(ch==')'){
                    if(!stack.isEmpty()&&stack.peek()=='('){
                        stack.pop();
                    }
                    else{
                        stack.push(ch);
                    }
                }
                else{
                    stack.push(ch);
                }
            }
            return stack.size();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s= "(())()())(";
        System.out.println(sol.minParenthesisAdd(s));
    }
}
