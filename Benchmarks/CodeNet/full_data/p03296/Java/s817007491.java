import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();


        }

        int cnt = 0;
        int b = 0;
        int r = 1;
        for (int i = 0 ; i < n ; i++) {


            if (b == a[i]) {
                r++;
            } else {
                b = a[i];
                cnt += r / 2;
                r = 1;
            }
        }

        System.out.println(cnt);
    }

}