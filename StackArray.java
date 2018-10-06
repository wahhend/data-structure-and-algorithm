class Stack{
    int top;
    ArrayStack arrStack = new ArrayStack();
    LinkedList ll = new LinkedList();

    public void push(int data){
        arrStack.addFirst(data);
        top = data;
    }

    public int pop(){
        top = arrStack.arr[1];
        return arrStack.removeFirst();
    }

    public int peek(){
        return top;
    }

    public void print(){
        for(int i:arrStack.arr)
            System.out.print(i+" ");
        System.out.println();
    }
}

class MainStackArray{
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