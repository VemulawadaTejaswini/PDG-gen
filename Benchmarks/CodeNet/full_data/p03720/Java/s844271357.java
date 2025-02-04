import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] cities = new int[N];
        for (int i = 0; i < M * 2; i++) {
            int n = sc.nextInt();
            cities[n - 1]++;
        }
        for (int i = 0; i < N; i++) {
            System.out.println(cities[i]);
        }
    }
}