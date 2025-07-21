package StackAndQueue;

public class CircularQueue {
    protected int[] data;

    private static final int DEFAULT_SIZE = 10;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data=new int[size];
    }
    protected int end=0;
    protected int front=0;

    public boolean isFull() {
        return end==data.length;
    }

    public boolean isEmpty() {
        return end==0;
    }
}
