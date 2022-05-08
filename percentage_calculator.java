//import javax.swing.text.Utilities;
import java.util.Scanner;

class abc{
    public static void main(String[] args) {
        System.out.println("welcome to the CBSE board percentage calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR MARKS SCHORED IN ENGLISH");
        int ENGLISh = sc.nextInt();
        System.out.println("ENTER YOUR MARKS SCORED IN MATHS");
        int MATHS = sc.nextInt();
        System.out.println("ENTER YOUR MARKS SCORED IN SCIENCE");
        int SCIENCE = sc.nextInt();
        System.out.println("ENTER YOUR MARKS SCORED IN SOCIAL_SCIENCES");
        int SOCIAL_SCIENCES = sc.nextInt();
        System.out.println("ENTER YOUR MARKS SCORED IN HINDI");
        int HINDI = sc.nextInt();
        
        int sum = ENGLISh+HINDI+MATHS+SCIENCE+SOCIAL_SCIENCES;
        int percentage = sum/5;
        System.out.println("YOUR PERCENTAGE IS: "+percentage);
        

    }
    }
