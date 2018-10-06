class ArrayStack{
    int[] arr = new int[0];

    public void addFirst(int data){
        int[] arr2 = new int[arr.length+1];
        arr2[0] = data;
        for(int i=1;i<arr2.length;i++)
            arr2[i] = arr[i-1];
        arr = arr2;
    }

    public int removeFirst(){
        int[] arr2 = new int[arr.length-1];
        for(int i=1;i<arr.length;i++)
            arr2[i-1] = arr[i];
        int pop = arr[0];
        arr = arr2;
        return pop;
    }
}