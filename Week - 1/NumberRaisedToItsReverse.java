import java.util.*;
class NumberRaisedToItsReverse{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        long ans=1;
        long mod = 1000000000+7;
        for (int i=1;i<=r;i++){
            ans*=n;
            ans%=mod;

        }
        System.out.print(ans);

    }
}