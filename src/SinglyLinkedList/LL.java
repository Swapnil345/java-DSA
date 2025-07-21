package SinglyLinkedList;

public class LL {

    private Node head;
    private Node tail;

    private int size;
    public LL(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }

        size+=1;
    }
//    public void insertLast(int val){
//        if(tail==null){
//            insertFirst(val);
//            return;
//        }
//        Node node = new Node(val);
//        tail.next=node;
//        tail=node;
//        size+=1;
//
//    }
//    public void insert(int val, int position){
//        if(position==0){
//            insertFirst(val);
//            return;
//        }
//        if(position==size){
//            insertLast(val);
//            return;
//        }
//        Node temp=head;
//        for(int i = 1;i<position;i++){
//            temp=temp.next;
//        }
//        Node node = new Node(val,temp.next);
//        temp.next=node;
//        size++;
//    }
    public void insertRec(int val,int index){
        head=insertRec(val,index,head);
    }
    private Node insertRec(int val,int index,Node node){
        if(index==0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
//        if(node==null){
//            throw new IndexOutOfBoundsException("Index is greater than list");
//        }
        node.next=insertRec(val,index-1,node.next);
        return node;
    }
//    public void deleteFirst(){
//        head=head.next;
//        if(head==null){
//            tail=null;
//        }
//        size--;
//    }
//    public void deleteLast() {
//        if (size == 0) {
//            System.out.println("LIST IS EMPTY");
//        } else if (size == 1) {
//            head = tail = null;
//        } else {
//            Node temp = head;
//            while(temp.next!=tail){
//                temp=temp.next;
//            }
//            temp.next = null;
//            tail=temp;
//        }
//        size--;
//    }
//    public void delete(int index){
//        if (size == 0) {
//            System.out.println("LIST IS EMPTY");
//        } else if (size == 1) {
//            head = tail = null;
//        } else{
//            Node temp=head;
//            for(int i=1;i<index;i++){
//                temp=temp.next;
//            }
//            temp.next=temp.next.next;
//        }
//        size--;
//    }
////    public int deleteLast() {
////        if (size <= 1) {
////            return deleteFirst();
////        }
////        Node secondLast=get(size-2);
////        int val=tail.value;
////        tail=secondLast;
////        tail.next=null;
////        size--;
////        return val;
////    }
////    public Node get(int index){
////        Node node = head;
////        for (int i=0;i<index;i++){
////            node=node.next;
////        }
////        return node;
////    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+ " ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
}
