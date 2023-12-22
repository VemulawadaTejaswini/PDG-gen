import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x  = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < m ; i++) {
            a[i] = sc.nextInt();
        }
        int l = 0;
        int r = 0;
        for (int i = 0 ; i < m ; i++) {
            if (a[i] < x) {
                l++;
            } else {
                r++;
            }
        }
        System.out.println(Math.min(l, r));
    }

}