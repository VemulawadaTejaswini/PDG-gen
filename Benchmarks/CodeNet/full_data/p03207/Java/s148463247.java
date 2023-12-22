import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] p = new int[N];
        for (int i = 0; i < p.length; i++) {
            p[i] = sc.nextInt();
        }
        int max = 0;
        int sum = 0;
        for (int i = 0; i < p.length; i++) {
            sum += p[i];
            max = Math.max(max, p[i]);
        }
        System.out.println(sum - max + max / 2);
        sc.close();
    }
}