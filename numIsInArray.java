import java.util.Scanner;
public class numIsInArray {
    public static void main(String[] args){
        System.out.print("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int [] marks ={98,99,100,26,47};
        int num = sc.nextInt();
        boolean isInAray = false;

        for(int element: marks){
            if(num == element){
                isInAray = true;
                break;
            }
        }
        if(isInAray){
            System.out.println("The number you entered is in the array");
        }
        else{
            System.out.println("The number you entered is not in the array");
        }
        }
}
