package StackAndQueue;

import java.util.Stack;

public class introStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(44);
        stack.push(32);
        stack.push(34);
        stack.push(22);
        stack.push(456);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
    }
}
