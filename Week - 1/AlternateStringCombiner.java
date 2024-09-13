import java.util.Scanner;
class AlternateStringCombiner{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s[] = str.split(","); 
        String a = s[0];
        String b = s[1];
        StringBuilder result = new StringBuilder();         // Result to store the combined string
        int minLength = Math.min(a.length(), b.length());       // Find the length of the shorter string
        for (int i = 0; i < minLength; i++) { // Combine characters alternately
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }
        if (a.length() > minLength) {       // Append remaining characters from the longer string
            result.append(a.substring(minLength));
        } else if (b.length() > minLength) {
            result.append(b.substring(minLength));
        }
        // Print the result
        System.out.println(result.toString());
    }
}