package linkedlist;

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

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

    }

}


