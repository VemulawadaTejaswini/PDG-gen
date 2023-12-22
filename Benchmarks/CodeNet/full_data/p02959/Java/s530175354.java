import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] monsters = new int[n+1];
        int[] power = new int[n];
        for (int i = 0; i <= n; i++) monsters[i] = sc.nextInt();
        for (int i = 0; i < n; i++) power[i] = sc.nextInt();

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += Math.min(monsters[i]+monsters[i+1], power[i]);
        }
        System.out.println(result);
    }
}