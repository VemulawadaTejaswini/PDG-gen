import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.next());

        int[] p = new int[n];
        Scanner scp = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(scp.next());
        }

        int cnt = 0;
        for (int i = 1; i < n-1 ; i++) {
            if ((p[i] - p[i-1])*(p[i] - p[i+1]) < 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}