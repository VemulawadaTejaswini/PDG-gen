import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        int[] l = new int[n];
        int[] r = new int[n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            l[a]++; r[b]++;
        }
        for (int i = 1; i < n; i++) {
            l[i] += l[i-1]; r[i] += r[i-1];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int q1 = sc.nextInt()-1;
            int q2 = sc.nextInt()-1;
            int tmp = r[q2];
            tmp -= 0 < q1 ? l[q1-1] : 0;
            sb.append(tmp + "\n");
        }
        System.out.print(sb.toString());
        sc.close();

    }

}
