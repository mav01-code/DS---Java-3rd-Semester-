import java.util.Scanner;

class PadovanSequence{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(func(i) + " ");
        }
    }
    public static int func(int n){
            if(n==0||n==1||n==2){
                return 1;
            }
            
            return (func(n-2)+func(n-3));
            
    
}
}