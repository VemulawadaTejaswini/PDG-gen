import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0 ; i < 35 ; i++) {
            boolean flg = true;
            for (int j = 0 ; j < n ; j++) {
                if (a[j] % 2 != 0) {
                    flg = false;
                }
            }
            if (flg) {
                count++;
                for (int j = 0 ; j < n ; j++) {
                    a[j] /= 2;
                }
            } else {
                break;
            }
        }
        System.out.println(count);
    }

}