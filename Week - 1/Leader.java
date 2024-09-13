import java.util.Scanner;
class Leader{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int Secondfromright = arr[n-1];
        String leader=Secondfromright + " ";
        for (int i=n-2;i>=0;i--){
            if(arr[i]>Secondfromright){
                Secondfromright = arr[i];
                leader = Secondfromright + " " + leader;
            }
            else if(arr[i]==Secondfromright){
                Secondfromright = arr[i];
                leader = Secondfromright + " " + leader;
            }

        }
        System.out.print(leader);
    }
}