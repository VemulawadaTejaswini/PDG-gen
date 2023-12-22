import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        int[][] lr = new int[n][2];
        for (int i = 0; i < q ; i++) {
            for (int j = 0; j < 2; j++) {
                lr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < q; i++) {
            String ss = s.substring(lr[i][0] -1, lr[i][1]);
            String sss = ss.replaceAll("AC", "");
            int ans = (ss.length() - sss.length()) / 2;
            System.out.println(ans);
        }
    }
}