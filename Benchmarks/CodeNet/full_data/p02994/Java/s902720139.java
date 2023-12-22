import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), l = sc.nextInt();
        int sum = 0, f = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int v = l + i;
            sum += v;
            if (Math.abs(v) < Math.abs(f)) f = v;
        }
        System.out.println(sum - f);
    }
}