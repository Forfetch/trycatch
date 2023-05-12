import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter first number ");
            int first = scanner.nextInt();
            try {
                System.out.println("Enter second number ");
                int sec = scanner.nextInt();
                scanner.close();
                int res = first/sec;
                System.out.println("Result " + res);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero!!!!!");
            }

        } catch (Exception ex ){
            System.out.println("Invalid number");
        }
    }
}
