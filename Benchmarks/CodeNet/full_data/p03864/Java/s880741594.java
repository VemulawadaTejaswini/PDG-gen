import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt(), a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        long cnt = 0;
        cnt += Math.max(0, a[0]-x); //First element
        long current = a[0]-cnt;
        for (int i = 1; i < n; i++) {
            cnt += Math.max(0, current+a[i]-x);
            current = a[i]-Math.max(0, current+a[i]-x);
        }
        System.out.println(cnt);
    }
}