import java.util.*;
public class skipMul10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n;
        do{
            System.out.println("Enter your number");
            n = sc.nextInt();

            if(n%10==0){
                continue;
            }
            System.out.println("Number was: "+n+"\n");
        }while(true);
    }
}
