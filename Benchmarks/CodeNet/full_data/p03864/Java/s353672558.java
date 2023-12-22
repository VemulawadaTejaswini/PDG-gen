import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt(), a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int cnt = 0;
        cnt += Math.max(0, a[0]-x); //First element
        int current = a[0]-cnt;
        for (int i = 1; i < n; i++) {
            int temp = cnt;
            cnt += Math.max(0, current+a[i]-x);
            current = a[i]-(cnt-temp);
        }
        System.out.println(cnt);
    }
}
