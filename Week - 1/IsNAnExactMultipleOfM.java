import java.util.Scanner;
public class IsNAnExactMultipleOfM
{
    public static int checkMultiple(int num1, int num2){
        if(num1==0 || num2 ==0){
            return 3; 
        }
        if(num2<0){
            System.out.println("Not valid");
        }
        if (num1 % num2 == 0) {
            return 2;
        }else {
            return 1;
        }
    
 }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] nums = input.split(" ");
        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);
        System.out.println(checkMultiple(num1, num2));
 }
}