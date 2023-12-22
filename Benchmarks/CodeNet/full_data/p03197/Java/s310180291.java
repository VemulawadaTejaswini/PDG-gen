import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        boolean hasOdd = false;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if (a[i] % 2 != 0) {
                hasOdd = true;
            }
        }
        if (hasOdd) {
            System.out.println("first");
        } else {
            System.out.println("second");
        }
    }

}
