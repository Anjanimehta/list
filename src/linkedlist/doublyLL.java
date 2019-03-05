package linkedlist;

class Node {
    int data;
    Node next;
    Node previous;
}

public class doublyLL {
    Node head;
    int size;

    public static void main(String[] args) {
        doublyLL obj = new doublyLL();
        obj.display();
    }

    //insert at the lst
    void insert(Node node) {
        System.out.println("insert node" + node.data + "at last");
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            node.previous = temp;
            temp.next = node;
        }
    }

    void display() {
        System.out.println("doubly linked list");
        Node temp = head;
        System.out.println("null<--->");
        while (temp != null) {
            System.out.println(temp.data + "<---->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //delete from last
    void delete()
    {
        if (head == null) {
            System.out.println("empty list");
        }
        else
            {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            System.out.println("deleting node" + temp.data + "from last");
            temp = temp.previous;

            temp.next = null;
        }
    }
    boolean search(Node node)
    {
        boolean response=false;
        Node temp=head;
        while(temp.next=null) {
            if (temp.data == node.data) {
                response = true;
                break;
            }
            temp = temp.next;
        }
       return response;
    }
    void insertAtBegining(Node node)
    {
        System.out.println("inserting node"+node.data+"at begining");
        if(head==null)
        {
            head=node;
        }
        else
        {
            node.next=head;
            head.previous=node;
            head=node;
        }
    }
}
