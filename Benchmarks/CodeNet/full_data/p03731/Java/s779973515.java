import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = sc.nextLong();
        long[] tt = new long[n];
        long sum = 0l;
        for (int i = 0; i < tt.length; i++) {
            tt[i] = sc.nextLong();
        }
        for (int i = 1; i < tt.length; i++) {
            if(tt[i] - tt[i - 1] < t) {
                sum += tt[i] - tt[i - 1];
            } else {
                sum += t;
            }
        }
        System.out.println(sum + t);
    }
}
