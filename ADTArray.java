class Array{
    int[] arr = new int[0];

    public void addLast(int data){
        int[] arr2 = new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            arr2[i] = arr[i];
        }
        arr2[arr.length] = data;        
        arr = arr2;
    }

    public void remove(int data){
        int idx = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==data){
                idx = i;
                break;
            }
        }

        int count = 0;
        int[] arr2 = new int[arr.length-1];
        for(int i=0;i<arr.length;i++){
            if(i==idx){
                continue;
            }
            arr2[count] = arr[i];
            count++;
        }
        System.out.println(arr2);
        System.out.println(arr);
        System.out.println();
        arr = arr2;
        System.out.println(arr);
    }

    public void print(){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}

class Main{
    public static void main(String[] args){
        Array arr = new Array();

        arr.addLast(1);
        arr.addLast(2);
        arr.addLast(3);
        arr.addLast(4);
        arr.print();

        arr.remove(1);
        arr.print();
    }
}