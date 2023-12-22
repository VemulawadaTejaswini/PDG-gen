
import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    private static final PrintStream ps = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        ps.println(f(n-1, k-1));
    }
    
    static int f(int a, int b) {
        return (a + b - 1) / b;
    }
}
