import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] P = new int[M];
        int[] Y = new int[M];
        for (int i = 0; i < M; i++) {
            P[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < M; i++) {
            map.put(Y[i], i);
        }
        int[] counter = new int[N];
        int[] x = new int[M];
        for (int value : map.values()) {
            counter[P[value] - 1]++;
            x[value] = counter[P[value] - 1];
        }
        for (int i = 0; i < M; i++) {
            String res = String.format("%06d", P[i]) + String.format("%06d", x[i]);
            System.out.println(res);
        }
        sc.close();
    }
}