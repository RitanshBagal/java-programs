import java.util.Scanner;

import javax.naming.event.NamingExceptionEvent;
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T !=0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int P = sc.nextInt();

            int incorrectmarks = (N-X)*1;
            int correctanswermarks = (3*X)-incorrectmarks;
    
            if(correctanswermarks>=P){
                System.out.println("PASS");
            }
            else{
                System.out.println("FAIL");
            }
            T--;
        }

    }
}