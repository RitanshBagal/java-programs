import java.util.Scanner;

public class ascii {
    public static void value(char c) {
    int ascii = c;
    System.out.println("The ASCII value of " + c + " is: " + ascii);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    // Taking user input
    System.out.print("Enter a character: ");
    char inputChar = sc.next().charAt(0);  // Reading the first character of the input

    value(inputChar);
    
    sc.close();
  }
}
