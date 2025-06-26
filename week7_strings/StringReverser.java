//A program that reverses a string
import java.util.Scanner;

public class StringReverser {
    /** 
     * main - entrypoint of program
     * @args: command line arguments 
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        
        String input = scanner.nextLine();

        StringBuilder reversed1 = new StringBuilder(input).reverse();
        System.out.println("The reversed string is: " + reversed1.toString());
    } 
       
} 