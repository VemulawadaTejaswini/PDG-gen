import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        boolean answer = b - a == c - b;
        System.out.println(answer ? "YES" : "NO");
    }
}
