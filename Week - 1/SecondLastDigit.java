import java.util.Scanner;
class SecondLastDigit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = (num%100)/10;
        System.out.println(n);
    }
}