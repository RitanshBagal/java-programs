import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;

        if(n==2){
            System.out.println("n is prime");
        }
        else{
            for(int i= 2;i<=Math.sqrt(n);i++){  // underroot n.... / int i = 2;i<n;i++
                if(n%i==0){
                    isPrime = false;
                }
            }
    
            if(isPrime == true){
                System.out.println("n is Prime");
            }
            else{
                System.out.println("n is not prime");
            }
        }
    }
}
