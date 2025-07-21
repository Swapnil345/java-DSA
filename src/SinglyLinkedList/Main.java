package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(9);
        list.insertFirst(5);
        list.insertFirst(3);
        list.display();
        list.insertRec(7,3);
        list.display();
    }
}
