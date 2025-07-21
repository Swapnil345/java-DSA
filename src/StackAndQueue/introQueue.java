package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class introQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(32);
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(22);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

//        Dequeue = Doubly Ended Queue
        Deque<Integer> dequeue = new ArrayDeque<>();
        dequeue.add(89);
        dequeue.addLast(78);
        dequeue.removeFirst();
    }
}
