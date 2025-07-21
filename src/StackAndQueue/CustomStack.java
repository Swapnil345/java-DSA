package StackAndQueue;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data=new int[size];
    }
    int ptr=-1;

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int element = data[ptr];
        ptr--;
        return element;
    }

    public boolean isFull() {
        return ptr==data.length-1;
    }

    public boolean isEmpty() {
        return ptr==-1;
    }


    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return data[ptr];
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
        stack.push(40);
        stack.push(41);
        stack.push(42);
        stack.push(43);
        stack.push(44);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
