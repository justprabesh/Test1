import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int product = 1;

        if (number == 0) {
            product = 0;
        } else {
            while (number != 0) {
                int digit = number % 10;
                product *= digit;
                number /= 10;
            }
        }

        System.out.println("Product of digits: " + product);

        scanner.close();
    }
}
