import java.util.Scanner;
class EvenOrOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=5;
        int count=0;
        int nums[]=new int[size];
        for (int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        sc.nextLine();
        String s6 = sc.nextLine();
        for(int i=0; i<size;i++){
            if(s6.equals("odd")){
                if(nums[i]%2!=0){
                count++;
            }
        }
            else if(s6.equals("even")){
            if(nums[i]%2==0){
                count++;
            }
        }

        }        
    }
}