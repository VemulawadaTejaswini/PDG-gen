import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] count = new int[n][10];
        char[] c = sc.next().toCharArray();
        count[0][c[0] - '0'] = 1;
        for(int i=1; i<n; i++) {
            int a = c[i] - '0';
            for(int j=0; j<10; j++) {
                count[i][j] = count[i-1][j];
                if(j == a) {
                    count[i][j]++;
                }
            }
        }

        int res = 0;
        for(int i=0; i<10; i++) {
            int a = find(count, -1, n, i, 1);
            if(a == n) continue;
            for(int j=0; j<10; j++) {
                int b = find(count, a, n, j, count[a][j] + 1);
                if(b==n) continue;
                for(int k=0; k<10; k++) {
                    if(count[n-1][k] > count[b][k]) res++;
                }
            }
        }
        System.out.println(res);

    }

    static int find(int[][] count, int l, int r, int num, int t) {
        int mid;
        while(r-l > 1) {
            //System.out.println(l + ":" + r);
            mid = (r+l)/2;
            if(count[mid][num] < t) {
                l = mid;
            } else {
                r = mid;
            }
        }
        return r;
    }
}
