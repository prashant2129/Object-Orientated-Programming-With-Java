import java.util.Scanner;

public class SimpleCalculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, result = 0;
        char operator;

        System.out.println("--- SimpleCalculator1 ---");
        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    sc.close();
                    return;
                }
                result = num1 / num2;
                break;

            default:
                System.out.println("Invalid operator!");
                sc.close();
                return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
