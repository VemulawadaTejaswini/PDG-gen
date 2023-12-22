import java.util.Scanner;
 
public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long H = scanner.nextInt();
        final long W = scanner.nextInt();
        System.out.println(H*(W/2) + (W%2)*((H+1)/2));

    }
}