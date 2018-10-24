class ArrayStackQueue{
    int[] arr = new int[0];

    public void addFirst(int data){
        int[] arr2 = new int[arr.length+1];

        arr2[0] = data;

        for(int i=0;i<arr.length;i++){
            arr2[i+1] = arr[i];
        }

        arr = arr2;
    }

    public int removeFirst(){
        int[] arr2 = new int[arr.length-1];
        deleted = arr[0]

        for(int i=0;i<arr2.length;i++){
            arr2[i] = arr[i+1];
        }

        arr = arr2;

        return deleted;
    }

    public void addLast(int data){
        int[] arr2 = new int[arr.length+1];

        for(int i=0;i<arr.length;i++){
            arr2[i] = arr[i]
        }

        arr2[arr2.length] = data;
    }
}