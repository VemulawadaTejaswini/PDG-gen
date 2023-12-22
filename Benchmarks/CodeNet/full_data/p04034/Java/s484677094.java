import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int res = 0;
        int[][] L = new int[n][2];
        for(int i = 0; i < n; i++) L[i][1] = 1;
        L[0][0] = 1;
        for(int i = 0; i < m; i++) {
            int x = Integer.parseInt(sc.next())-1, y = Integer.parseInt(sc.next())-1;
            if(L[x][0] == 1) {
                L[y][0] = 1;
            }
            L[x][1]--;
            L[y][1]++;
            if(L[x][1] == 0) L[x][0] = 0;
        }
        for(int i = 0; i < n; i++) res += L[i][0];
        System.out.println(res);
    }
}
