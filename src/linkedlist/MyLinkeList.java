package linkedlist;

public class MyLinkeList {
    private  Node  head;
    private Node tail;
    private int CurrentSize;


    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void setCurrentSize(int currentSize) {
        CurrentSize = currentSize;
    }

    public int getCurrentSize() {
        return CurrentSize;
    }

    public MyLinkeList(Node head, Node tail, int currentSize) {
        this.head = head;
        this.tail = tail;
        CurrentSize = currentSize;
    }

    public static void main(String[] args) {
        MyLinkeList linkList=new MyLinkeList();
        //function
        // linkList.insert;
        //linkList.remove;
        //linklist.insert(node);
        /* if head -> null and tail->null
        node->next =null
        head=node
        tail=node
        else

         */

        Node  node=new Node(10,null);
    }
}
