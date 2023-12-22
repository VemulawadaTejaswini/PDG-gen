import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        boolean[] used = new boolean[n];
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt() - 1;
            int c = sc.nextInt();
            if (used[s] && c != arr[s]) {
                System.out.println(-1);
                return;
            }
            if (s == 0 && c == 0 && n != 1) {
                System.out.println(-1);
                return;
            }
            used[s] = true;
            arr[s] = c;
        }
        if (n != 1 && arr[0] == 0) {
            arr[0] = 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]);
        }
		System.out.println(sb);
   }

}
