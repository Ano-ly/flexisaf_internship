//A program that converts from Numbers to Strings and back to Numbers

public class NumberStringConverter {
    a
    public static void main(String[] args) {
        int num1 = 34;
        System.out.println("Converting from Integer(Number) to String:\n");
        String str1 = Integer.toString(num1);
        System.out.println(str1); 

        System.out.println("Converting from String to Integer(Number):\n");
        int convertedNum1 = Integer.valueOf(str1);
        System.out.println(str1 + " plus 5 is equal to ");
        System.out.println(convertedNum1 + 5);

        double num2 = 34.4;
        System.out.println("Converting from Double(Number) to String:\n");
        String str2 = Double.toString(num2);
        System.out.println(str2); 

        System.out.println("Converting from String to Double(Number):\n");
        double convertedNum2 = Double.valueOf(str2);
        System.out.println(str2 + " plus 5 is equal to ");
        System.out.println(convertedNum2 + 5);
    }
} 