import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (Math.abs(a - b) % 2 == 0) {
            System.out.println(Math.abs(a - b) / 2);
        } else {
            int cand1 = Math.max(b - 1, a - 1);
            int cand2 = Math.max(n - b, n - a);
            System.out.println(Math.min(cand1, cand2));
        }
    }
}