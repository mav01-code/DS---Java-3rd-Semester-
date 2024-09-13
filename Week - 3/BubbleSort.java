class BubbleSort{
    public static void main(String args[]){
        int arr[] = {3, 5, 2, 9, 7, 8};
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;                    
                }
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}