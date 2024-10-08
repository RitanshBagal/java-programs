import java.util.*;

public class removeVowles {
    private static String removeVow(String str){
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u'|| str.charAt(i) == 'A'||str.charAt(i) == 'E'||str.charAt(i) == 'I'||str.charAt(i) == 'O'||str.charAt(i) == 'U'){
                str = str.substring(0, i) + str.substring(i+1);
                i--;
            }
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("string w/o vowels: "+removeVow(str));
    }
}
