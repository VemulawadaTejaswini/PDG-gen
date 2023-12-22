import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int x = in.nextInt();
        int b = in.nextInt();
        if (x >= b) {
            System.out.println(10);
        } else {
            System.out.println(0);
        }
    }
}