import java.util.Arrays;
import java.util.Scanner;

class BinarySearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int left = 0;
        int right = size-1;
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int target = sc.nextInt();
        System.out.print(Binary(arr,left,right,target));
    }
    
    public static int Binary(int[] arr,int left, int right, int target){
        
        int mid = (left+right)/2;
        if(target==arr[mid]){
            return mid;
        }
        if(arr[mid] < target) {
                return Binary(arr,mid + 1,right, target);
        }else if(arr[mid]>target) {
                return Binary(arr,left,mid - 1,target);
        }
        return -1;

    }
    
}

