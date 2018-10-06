class Node{
    String nama;
    Node next;
    
    Node(String nama){
        this.nama = nama;
    }
}

class LinkedList{
    Node head;
    Node tail;
    int counter = -1;
    
    public void add(String nama){
        Node newNode = new Node(nama);
        if(head==null){
            newNode.next = newNode;
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        counter++;
    }
    
    public String remove(String nama){
        Node delete = head;
        if(head.nama == nama){
            return removeHead();
        }
        else{
            Node current = head;
            
            while(current.next != tail){
                if(current.next.nama == nama){
                    delete = current.next;
                    current.next = current.next.next;
                    return delete.nama;
                }
                current = current.next;
            }
            
            if(tail.nama == nama){
                delete = tail;
                current.next = current.next.next;
                tail = current;
                
                return delete.nama;
            }
        }
           
        return "";
    }
    
    public String removeHead(){
        Node delete = head;
        if(head==tail){
            head=null;
            tail=null;
        }
        else{
            delete = head;
            head = head.next;
            tail.next = head;
        }
        
        
        return delete.nama;
    }
    
    public Array sikat(int count){
        Array arr = new Array();
        Node current = head;
        int count2 = 1;
        while(head!=null){
            if(count2 == count){
                arr.addLast(remove(current.nama));
                count2 = 0;
            }
            count2++;
            current = current.next;
        }
        return arr;
    }
    
    public void print(){
        int count = 1;
        Node current = head;
        
        if(head!=null){
            while(current != tail){
            System.out.println(count+". "+current.nama);
            count++;
            current = current.next;
        }
        
        System.out.println(count+". "+current.nama);
        }
    }
}

class Array{
    String[] arr = new String[0];

    public void addLast(String nama){
        String[] arr2 = new String[arr.length+1];
        for(int i=0;i<arr.length;i++){
            arr2[i] = arr[i];
        }
        arr2[arr.length] = nama;
        arr = arr2;
    }
    
    public void print(){
        int count = 1;
        for(String nama:arr){
            System.out.println((count++)+". "+nama);
        }
    }
}

public class UTP {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.add("Joni");
        ll.add("Jono");
        ll.add("Budi");
        ll.add("Ani");
        ll.add("Hana");
        ll.add("Banu");
        ll.add("Caca");
        ll.add("Eka");
        ll.add("Fani");
        ll.add("Ima");
        ll.print();
        
        Array arr = ll.sikat(3);
        System.out.println();
        arr.print();
    }
}