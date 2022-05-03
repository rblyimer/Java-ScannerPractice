import java.util.Scanner;

public class VariableInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of text: ");
        String text = scanner.nextLine();
        System.out.println("Enter an integer: ");
        int integer = scanner.nextInt();
        System.out.println("Enter a double: ");
        double double1 = scanner.nextDouble();
        System.out.println("Enter a boolean value: ");
        boolean bool = scanner.nextBoolean();
        System.out.println("Your string is " + text);
        System.out.println("Your integer is " + integer);
        System.out.println("Your double is " + double1);
        System.out.println("Your boolean is " + bool);
        scanner.close();
    }
}
