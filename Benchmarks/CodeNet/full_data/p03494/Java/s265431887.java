import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        int count = 0;
        boolean isOdd = false;
        while (true) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 != 0) {
                    isOdd = true;
                }
            }
            if (isOdd) {
                break;
            } else {
                for (int i = 0; i < a.length; i++) {
                    a[i] = a[i] / 2;
                }
                count++;
            }
        }

        System.out.println(count);
    }
}
