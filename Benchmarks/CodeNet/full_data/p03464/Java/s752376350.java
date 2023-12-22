import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] a = new int[k + 1];
        boolean possible = true;
        for (int i = 1; i < a.length; i++) a[i] = scanner.nextInt();

        int n = 2;
        int max = 0;
        int min = 0;
        for (int i = a.length - 1; i >= 1; i--) {
            if (i != 1) {
                int r = a[i - 1] - (n % a[i - 1]);
                if (r > a[i]) {
                    possible = false;
                    break;
                }
                n = n + r % a[i];
            }
            else {
                max = n + a[i] - 1;
                min = n;
            }
        }

        if (!possible) System.out.println(-1);
        else System.out.println(min + " " + max);
    }
}
