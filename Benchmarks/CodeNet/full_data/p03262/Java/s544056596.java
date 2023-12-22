import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        List<Integer> dist = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int Xi = sc.nextInt();
            int d = Math.abs(X - Xi);
            dist.add(d);
        }
        int g = dist.get(0);
        for (int i = 1; i < dist.size() - 1; i++) {
            g = gcd(g, dist.get(i));
        }
        System.out.println(g);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return Math.abs(a);
    }
}