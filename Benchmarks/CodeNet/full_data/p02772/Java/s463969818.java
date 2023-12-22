import java.util.Scanner;
 
public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; ++i) {
            int number = scanner.nextInt();
            if (number % 2 == 0 && ((number % 5 != 0) && (number % 3 != 0))) {
                System.out.println("DENIED");
                return;
            }
        }
        System.out.println("APPROVED");
    }
}