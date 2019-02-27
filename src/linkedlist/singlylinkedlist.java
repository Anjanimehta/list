package linkedlist;

import java.util.ArrayList;

public class singlylinkedlist {

    private class Node
    {
        private int data;
        private  Node next;
        public int getdata()
        {
            
            return data;

        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
        //linked list ka head and ka size
    }
     private  Node head=null;
    private  int size=0;

    public static void main(String[] args) {
        singlylinkedlist linkedlist= new singlylinkedlist();


      //  for (int i = 0; i < 5; i++) {
            linkedlist.insert(42);
            linkedlist.insert(66);
             System.out.println(linkedlist);
             linkedlist.remove(66);

        //}
            System.out.println(linkedlist); 

    }

    @Override
    public String toString() {
        StringBuilder response=new StringBuilder();      //string is immutable baar baar ek hi ki value change krenge
        response.append("[");
        Node temp=this.head;//cpy created becoz if head is changed it will directly change the hdead of list
        while(temp!=null)  //last node is null
        {
               response.append(temp.getdata());
               response.append(" => ");
               temp=temp.next;


        }

        response.append("]");
        return response.toString();
    }
    //insert head
    private  void insertHead(int data)      //helper methods that is why private...head is bottom for empty list
    {
       /* Node newNode=new Node(data,this.head);//head values becomes new head's next
        this.head=newNode; */
        this.head=new Node(data,this.head);
        size++;


    }
    private void insertAfter(int data,Node node)                        //list is nt empty
    {
        Node newNode=new Node(data,node.next);
        node.next=newNode;

    }
    public void insert(int data) {

        if (head == null)
            insertHead(data);

        else {
            Node temp = this.head;  //so that heads value does not chmgr
            while (temp.next!= null) {
                temp = temp.next;

            }
            insertAfter(data, temp);
        }
    }
    //new head is the next of previous head
    //return type is int to tell which element got deleted
    //helper method
    private int removeHead()
    {
        int response=-1;
        Node temp=this.head;//copy created
        if(temp!=null)
        {
           this.size--;
           this.head=this.head.next;
        }
         return response;
    }
    private int removeAfter(Node node)//node next to it will be removed       //remove after any position
    {
        int response=-1;
        Node temp=node.next;
        if(temp!=null)
        {
            response=temp.data;
            node.next=temp.next;
            size--;
        }
        return response;
    }
     //both helper method called hera
    public int remove(int data)
    {
             int response=-1;
             Node temp=this.head;
              if(temp.data==data)
              {
                  response=removeHead();
              }
              else
              {
                  while(temp!=null)
                  {
                      if(temp.data==data)
                      {
                          response=removeAfter(temp);
                          break;
                      }
                      temp=temp.next;
                  }

              }
              return response;
    }




}


