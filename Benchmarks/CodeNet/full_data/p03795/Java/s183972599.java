import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int x = N * 800;
        int y = N / 15 * 200;
        System.out.println(x - y);
    }
}
