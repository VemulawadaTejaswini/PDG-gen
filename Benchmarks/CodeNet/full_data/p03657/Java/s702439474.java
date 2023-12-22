import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a + b;
        boolean answer = false;
        if (a % 3 == 0) {
            answer = true;
        } else if (b % 3 == 0) {
            answer = true;
        } else if (c % 3 == 0) {
            answer = true;
        }
        System.out.println(answer ? "Possible" : "Impossible");
    }
}
