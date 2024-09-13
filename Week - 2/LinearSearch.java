import java.util.Scanner;
class LinearSearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]==target){
                found=true;
                System.out.print(i);
            }
        
        }
        if(!found){
            System.out.print("Not found");
        }
    }
}