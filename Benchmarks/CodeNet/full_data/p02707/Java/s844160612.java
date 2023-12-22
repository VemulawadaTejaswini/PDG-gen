import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] counts = new int[n + 1];
        for (int i = 1; i < n; i++) {
            counts[sc.nextInt()]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(counts[i]).append("\n");
        }
        System.out.print(sb);
    }
}