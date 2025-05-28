// A program that returns associated grade when provided with a score
// Uses OAU's grading system
// Demonstrates use of if-else statements, and variables/fields in Java
import java.util.Scanner;

//class 'GradeCalc'
class GradeCalc {
    /** 
     * main - entrypoint of program
     * @args: command line arguments 
    */
    public static void main(String[] args) {
        int score;
        
        System.out.println("This program outputs your grade according to the Obafemi Awolowo University Grading System.\n Enter your score: ");
        Scanner inputReader = new Scanner(System.in);

        //Ensure user inputs integer
        while (true) {
            if (inputReader.hasNextInt()) {
                score = inputReader.nextInt();
                break;
            } else {
                System.out.println("Please input an integer.");
                inputReader.nextLine();
            }
        }
        
        if (score < 40) {
            System.out.println("You had an F in the course");
        } else if (score >= 40 && score < 45) {
            System.out.println("You had an E in the course");
        } else if (score >= 45 && score < 50) {
            System.out.println("You had a D in the course");
        } else if (score >= 50 && score < 60) {
            System.out.println("You had a C in the course");
        } else if (score >= 60 && score < 70) {
            System.out.println("You had a B in the course");
        } else if (score >= 70) {
            System.out.println("You had an A in the course");
        }

        inputReader.close();
    }
}
