
import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b) {
        if(a < b) return gcd(b,a);
        if(b == 0) return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer a = Integer.parseInt(scanner.next());
        Integer b = Integer.parseInt(scanner.next());

        int sum = gcd(a, b);
        System.out.println((a * b) / sum);
    }
}
