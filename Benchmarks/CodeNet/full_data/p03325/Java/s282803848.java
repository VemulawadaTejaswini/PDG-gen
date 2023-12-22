import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < a.length; i++) {
                a[i] = in.nextInt();
            }

            int count = 0;
            for (int i = 0; i < a.length; i++) {
                while (a[i] % 2 == 0) {
                    a[i] /= 2;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
