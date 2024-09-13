
import java.util.Scanner;

class SumOfLastDigitsOfTwoGivenNumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        String[] nums = input.split(" ");
        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);
        System.out.println(addLastDigits(num1,num2));
    }
    static int addLastDigits(int num1, int num2){
        int first;
        int last;
        first = num1%10;
        last = num2%10;
        return first+last;
    }
}