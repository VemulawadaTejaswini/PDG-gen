import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= Math.max(x, y); i++) {
            int xx = x - i;
            if(xx < 0) {
                xx = 0;
            }
            int yy = y - i;
            if(yy < 0) {
                yy = 0;
            }
            int tmp = (c * 2) * i + (a * xx) + (b * yy);
            ans = Math.min(tmp, ans);
        }
        System.out.println(ans);
    }
}