import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1要素の場合は1
        int n = Integer.parseInt(scanner.nextLine());
        if (n == 1) {
            System.out.println(1);
            System.exit(0);
        }
        int[] a = new int[n];

        int i = 0;
        for (String ai: scanner.nextLine().split(" ")) {
            a[i++] = Integer.parseInt(ai);
        }

        int x = 1;
        boolean plus = a[0] < a[1];

        for (i = 1; i < n - 1; i++) {
            if (plus && a[i] > a[i + 1]) {
                plus = i + 2 < n && a[i + 1] < a[i + 2]; // 2連続で小さくなっている場合はfalseになる
                x++;
            } else if (!plus && a[i] < a[i + 1]) {
                plus = i + 2 < n && a[i + 1] >= a[i + 2]; // 単調非減少な限りfalse
                x++;
            }
        }

        System.out.println(x);
    }
}