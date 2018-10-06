class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class LinkedList{
    Node head;
    Node tail;

    public boolean isEmpty(){
        return head==null? true:false;
    }

    //add data as first node in list
    public void addFirst(int data){
        Node newNode = new Node(data);
        //case for empty list
        if(isEmpty()){
            head = newNode;
            tail = head;
        }
        //case for adding node in the start of current list
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    //add data as last node in list
    public void addLast(int data){
        Node newNode = new Node(data);
        //case for empty list
        if(isEmpty()){
            tail = newNode;
            head = tail;
        }
        //case for adding node in the end of current list
        else{
            tail.next = newNode;
            tail = newNode;
        }
        
    }

    //add node after target value
    public void addAfter(int target, int data){
        Node newNode = new Node(data);
        Node current = head;
        //insert node in the middle of the list
        while(current!=tail){
            if(current.data == target){
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
        //special case if the target is tail
        if(current.data == target){
            addLast(data);
        }
    }

    //remove first node
    public int removeHead(){
        Node deleted = head;
        head = head.next;
        return deleted.data;
    }

    //remove last node
    public int removeTail(){
        Node deleted = tail;
        Node current = head;
        //find node before tail
        while(current.next != tail){
            current = current.next;
        }

        //delete last node, redirect tail pointer
        current.next = null;
        tail = current;
        return deleted.data;
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

class Main{
    public static void main(String[] args){
        LinkedList ll = new LinkedList();

        ll.addFirst(10);
        ll.addLast(5);
        ll.addFirst(20);
        ll.addAfter(20, 15);
        ll.addAfter(5, 0);
        ll.print();
        ll.removeHead();
        ll.removeTail();
        ll.print();
    }
}