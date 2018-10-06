class Stack{
    int top;
    ArrayStack arrStack = new ArrayStack();
    LinkedList ll = new LinkedList();

    public void push(int data){
        ll.addFirst(data);
        top = data;
    }

    public int pop(){
        int popData = ll.removeHead();
        top = ll.head.data;
        return popData;
    }

    public int peek(){
        return top;
    }

    public void print(){
        Node current = ll.head;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
}

class MainStackLL{
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(2);
        stack.push(5);
        stack.push(10);

        stack.print();

        System.out.println("dihapus: "+stack.pop());

        stack.print();

        System.out.println("top: "+stack.peek());

        stack.print();
    }
}