import java.net.SocketOption;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double NumberFromConsole = scanner.nextDouble();

        double result = Math.sqrt(NumberFromConsole);
        System.out.printf("Тhe square root of your number is %,.5f ",result);
    }
}
