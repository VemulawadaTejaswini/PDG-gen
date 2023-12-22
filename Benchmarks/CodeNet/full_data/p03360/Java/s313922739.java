import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int max = Math.max(Math.max(a, b), c);
        int op = max;
        for (int i = 0; i < k; i++) {
            op *= 2;
        }
        System.out.println(a + b + c - max + op);
    }
}