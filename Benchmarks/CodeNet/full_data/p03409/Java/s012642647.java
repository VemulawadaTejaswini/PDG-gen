import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] a = new int[n][2];
        for(int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }

        int[][] b = new int[n][2];
        for(int i = 0; i < n; i++) {
            b[i][0] = sc.nextInt();
            b[i][1] = sc.nextInt();
        }

        Arrays.sort(a, (x, y) -> x[0] == y[0] ? x[1] - y[1] : x[0] - y[0]);
        Arrays.sort(b, (x, y) -> x[0] == y[0] ? x[1] - y[1] : x[0] - y[0]);

        boolean[] selected = new boolean[n];
        int cnt = 0;
        int maxY = -1;
        int maxIdx = -1;
        for(int i = 0; i < n; i++) { // blue
            maxY = -1;
            maxIdx = -1;
            for(int j = 0; j < n; j++) { // red
                if(b[i][0] <= a[j][0]) break;
                if(!selected[j] && b[i][0] > a[j][0] && a[j][1] > maxY) {
                    maxY = a[j][1];
                    maxIdx = j;
                }
            }
            if(maxIdx != -1) {
                cnt++;
                selected[maxIdx] = true;
            }
        }
        System.out.println(cnt);
    }
}   