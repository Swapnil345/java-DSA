//Implementation of Queue using two Stacks (Google question)
//Leetcode 232

package StackAndQueueQuestions;

import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> first;
    Stack<Integer> second;
    public QueueUsingStacks(){
        first=new Stack<>();
        second=new Stack<>();
    }
    public void push(int x){
        first.push(x);
    }
    public int pop(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int popped= second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return popped;
    }
    public int peek(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked= second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }
    public boolean isEmpty(){
        return first.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.push(22);
        queue.push(23);
        queue.push(24);
        queue.push(25);
        System.out.println(queue.pop());

    }
}
