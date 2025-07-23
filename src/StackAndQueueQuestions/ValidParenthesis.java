package StackAndQueueQuestions;

import java.util.Stack;

public class ValidParenthesis {
    static class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for(char ch : s.toCharArray()){
                if(ch=='('||ch=='{'||ch=='['){
                    stack.push(ch);
                }
                else{
                    if(ch==')'){
                        if(stack.isEmpty()||stack.pop()!='('){
                            return false;
                        }
                    }
                    if(ch=='}'){
                        if(stack.isEmpty()||stack.pop()!='{'){
                            return false;
                        }
                    }
                    if(ch==']'){
                        if(stack.isEmpty()||stack.pop()!='['){
                            return false;
                        }
                    }
                }
            }
            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "(]";
        System.out.println(sol.isValid(s));

    }
}
