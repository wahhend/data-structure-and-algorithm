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

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addAfter(int target, int data){
        Node newNode = new Node(data);
        Node current = head;

        while(current.data!=target||current!=null){
            current = current.next;
        }
        if(current.data==target){
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public int removeHead(){
        int delete = head.data;
        head = head.next;
        return delete;
    }

    public void remove(int target){
        Node current = head;
        while(current.next.data!=target){
            current = current.next;
        }

        current.next = current.next.next;
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

