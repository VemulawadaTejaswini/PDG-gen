import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if ((a * 100 + b * 10 + c) % 4 == 0) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
        
    }
}