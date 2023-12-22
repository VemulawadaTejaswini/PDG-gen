
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        
        if (a <= b) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0 ; i < b ; i++) {
                builder.append(a);
            }
            System.out.println(builder.toString());
        } else {
            StringBuilder builder = new StringBuilder();
            for (int i = 0 ; i < a ; i++) {
                builder.append(b);
            }
            System.out.println(builder.toString());
        }
    }
}
