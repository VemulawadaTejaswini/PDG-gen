import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ball = new int[n];
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            ball[i] = sc.nextInt();
            count[ball[i] - 1] ++;
        }

        long sum = 0;
        for (int j = 0; j < n; j++) {
            int t = count[j];
            if(t > 1){
                sum += t * (t - 1) / 2;
            }
        }

        for (int i = 0; i < n; i++) {
            int t = count[ball[i] - 1];
            long r = sum - t + 1;

            System.out.println(r);
        }
    }
}