import java.util.*;
class CombineStrings{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
       System.out.println("Enter the first string: ");
       String s1=sc.nextLine();
       System.out.println("Enter the second string: ");
       String s2=sc.nextLine();
       if(s1.length()<s2.length()){
        System.out.println(s1+s2+s1);
       }
       else{
        System.out.println(s2+s1+s2);
       }
       
       sc.close();
    }
}