import java.util.*;

/**
 * palindrome
 */
public class palindrome {

    private static boolean solve(String str){
        int left= 0;
        int right = str.length()-1;
        while (left<right) {
            char l = str.charAt(left);
            char r = str.charAt(right);
            if(Character.toLowerCase(l)!=Character.toLowerCase(r)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean ans = solve(str);
        if(ans == true){
            System.out.println("The string is Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}