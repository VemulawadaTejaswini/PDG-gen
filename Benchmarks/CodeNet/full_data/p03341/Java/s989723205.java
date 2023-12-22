import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        int[] e = new int[n];
        int countw = 0;
        int counte = 0;
        char[] s = sc.next().toCharArray();
        for (int i = 0; i < n; i++) {
            if (s[i] == 'W') {
                countw++;
                w[i] += countw;
                e[i] = counte;
            } else if (s[i] == 'E') {
                counte++;
                e[i] += counte;
                w[i] = countw;
            }
        }
        int min = e[n - 1] - e[0];
        for (int i = 1; i < n - 1; i++) {
            int now = (w[i - 1]) + (e[n - 1] - e[i]);
            min = Math.min(now, min);
        }
        min = Math.min(w[n - 2], min);
        System.out.println(min);
    }
}
