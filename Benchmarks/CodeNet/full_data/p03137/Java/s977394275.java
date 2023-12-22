import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[m];
        for (int i = 0; i < m; i++) {
            x[i] = sc.nextInt();
        }

        Arrays.sort(x);
        
        int[] l = new int[m-1];
        for (int i = 1; i < m; i++) {
            l[i-1] = x[i] - x[i-1];
        }

        Arrays.sort(l);
        int cnt = 0;
        for (int i = 0; i < m-n; i++) {
            cnt += l[i];
        }
        
        System.out.println(cnt);
    }
}
