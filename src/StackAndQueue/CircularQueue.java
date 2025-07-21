package StackAndQueue;

public class CircularQueue {
    protected int[] data;
    private int size=0;
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
        return size==data.length;
    }

    public boolean isEmpty() {
        return end==0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }

        data[end]=item;
        end=end% data.length;
        size++;
        return true;
    }

    public int remove(){
        if(isEmpty()){
            return -1;
        }
        int removed=data[front++];
        front=front% data.length;
        size--;
        return removed;
    }
}
