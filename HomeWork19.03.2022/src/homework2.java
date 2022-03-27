import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int NumberFromConsole = scanner.nextInt();

        String result = NumberFromConsole % 2 == 0 ? "Even" : "Odd";
        System.out.println( "Your number is " +  result);
    }
}
