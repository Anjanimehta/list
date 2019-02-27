package linkedlist;

public class doublyLinkedList {
    private static class Node {
        private int data;
        private Node next;
        private Node pre;

        public Node(int data, Node pre, Node next) {
            this.data = data;
            this.pre = pre;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
            this.pre = null;
            this.next = null;
        }
        //when doubly linked list empty
        //head tail
        //head data nthng
        //single element ehich is tail nad head value of tail null ...head null

    }

    private int size = 0;
    private Node head = null;
    private Node tail = null;

    public static void main(String[] args) {
        doublyLinkedList linkedlist = new doublyLinkedList();
        System.out.println(linkedlist);
        for (int i = 0; i < 5; i++) {
            linkedlist.insertHead(i + 1);
        }
        System.out.println(linkedlist);//order is not maintained
    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder();
        response.append("[");
        Node temp = this.head;
        while (temp != null) {
            response.append(temp.data);
            if (temp.next != null) {
                response.append(" <==> ");
            }
            temp = temp.next;
        }
        response.append("]");
        return response.toString();
    }

    public void insertHead(int data)//value added at the head only
    {
        //Node newNode=new Node(data,null,this.head);
        //this.head=newNode;
        this.head = new Node(data, null, this.head);
        size++;


    }

    //as one node atleast
    //empty cond will not be chcked here
    public void insertAfter(int data, Node node) {
        Node newNode = new Node(data,node,node.next);
        node.next=newNode;
        newNode.next.pre=newNode;
        size++;
    }
    public void insert(int data)
    {
        if(head==null)
        {
            insertHead(data);
        }
        else
        {
            Node temp=this.head;//travered the entire to insert after the data matched
            while (temp!=null)
            {
                temp=temp.next;
            }
            insertAfter(data,temp);
        }
    }
}
