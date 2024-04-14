import java.util.Scanner;

public class primeNumCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Please Enter a prime number:  ");
        int num = scanner.nextInt();

        primeCheck(num);

        scanner.close();
    }
    public static void primeCheck(int num) {
        if (num <= 0) {
            System.out.println(num + " is not a prime number");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}
