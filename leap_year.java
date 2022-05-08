import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY YEAR");
       int year = sc.nextInt();
       boolean flag = false;

       if(year%400==0){
           flag = true;
       }
       else if(year%4==0){
           flag = true;
       }
       else if(year%100==0){
           flag = false;
              }
       else{
           flag = false;      
        }
        if(flag){
            System.out.println("year "+year+" is a leap year");
        }
        else
            System.out.println("year "+year+" is not a leap year");
    }    
}
