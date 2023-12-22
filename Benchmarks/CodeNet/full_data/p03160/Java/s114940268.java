import java.util.Scanner;

public class FrogP1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] h = new int[n];
        for (int i = 0 ; i < n ; i++) {
            h[i] = in.nextInt();
        }
        if (n == 1) {
            System.out.println(0); return;
        } else if (n == 2) {
            System.out.println(Math.abs(h[1] - h[0]));
            return;
        }
        int[] min = new int[n];
        min[0] = 0;
        min[1] = Math.abs(h[1] - h[0]);
        min[2] = Math.min(min[1] + Math.abs(h[2] - h[1]), Math.abs(h[2] - h[0]));
        for (int i = 3 ; i < n ; i++) {
            min[i] = Math.min(min[i-1] + Math.abs(h[i] - h[i-1]), min[i-2] + Math.abs(h[i] - h[i-2]));
        }
        System.out.println(min[n-1]);
    }
}
