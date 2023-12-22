import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;
        int[] balls = new int[n];
        for (int i = n; i > 0; i--) {
            int flg = 0;
            for (int j = i * 2; j <= n; j += i) {
                flg ^= balls[j - 1];
            }
            balls[i - 1] ^= a[i - 1] == flg ? 0 : 1;
            if(balls[i-1]>0){
                count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i < balls.length; i++) {
            if (balls[i] > 0) {
                System.out.print((i + 1) + " ");
            }
        }
        sc.close();
    }
}
