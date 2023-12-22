import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a - b >= 0) {
            System.out.println("delicious");
        } else if (x + a - b >= 0) {
            System.out.println("safe");
        } else {
            System.out.println("delicious");
        }
    }
}