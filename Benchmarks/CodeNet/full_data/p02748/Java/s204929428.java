import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int[] A = new int[a];
        int[] B = new int[b];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < a; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < b; i++) {
            B[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            String s = (sc.nextInt()-1 ) + "-" + (sc.nextInt()-1);
            map.put(s, sc.nextInt());
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                int val = A[i] + B[j];
                String s = i + "-" + j;
                int discount = map.getOrDefault(s, 0);
                min = Math.min(min, val - discount);
            }
        }

        System.out.println(min);
    }
}
