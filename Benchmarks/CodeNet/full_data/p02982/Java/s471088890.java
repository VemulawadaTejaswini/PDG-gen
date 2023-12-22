import java.math.*;
import java.util.*;
import java.lang.Math;
public class Main {
    static int sol(int a, int b) {
        return (int) Math.pow(a - b, 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int li[][] = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                int tmp = sc.nextInt();
                li[i][j] = tmp;
            }
        }
        List<Integer> rtli= new ArrayList<>();
        for(int i=0;i<300;i++)
            rtli.add(i * i);
        int tmp = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = 0; k < d; k++) {
                    tmp += sol(li[i][k], li[j][k]);
                }
                if (rtli.contains(tmp)){
                    cnt++;
                }
                tmp = 0;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
