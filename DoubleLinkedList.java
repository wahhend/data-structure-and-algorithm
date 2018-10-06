class Node{
    int data;
    Node next, prev;

    Node(int data){
        this.data = data;
    }
}

class DoubleLinkedList{
    Node head, tail;

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void removeLast(){
        if(head==tail){
            head = null;
            tail = null;
        }
        else{
            tail.prev.next = null;
            tail = tail.prev;
        }
        
    }

    public void print(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
}
