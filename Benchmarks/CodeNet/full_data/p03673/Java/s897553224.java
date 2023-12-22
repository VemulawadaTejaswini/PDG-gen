import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        List<Integer> b = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                b.add(0, a[i]);
            } else {
                b.add(a[i]);
            }
        }

        if (n % 2 == 0) {
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(b.get(i) + " ");
            }
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(b.get(i) + " ");
            }
        }
    }
}
