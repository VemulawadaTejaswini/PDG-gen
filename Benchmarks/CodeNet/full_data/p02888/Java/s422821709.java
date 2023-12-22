
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer[] L = new Integer[N];
        for (int i=0; i<N; i++) {
            L[i] = scanner.nextInt();
        }
        Arrays.sort(L, Comparator.reverseOrder());

        int count = 0;
        int a = 0;
        int b = 1;
        int c = 2;
        while (true) {
            if (isTriangle(L[a], L[b], L[c])) {
                count++;
            }
            if ((c + 1) < N) {
                c++;
            } else {
                if ((b + 2) < N) {
                    b++;
                    c = b + 1;
                    continue;
                } else if ((a + 3) < N) {
                    a++;
                    b = a + 1;
                    c = b + 1;
                    continue;
                }
                break;
            }
        }

        System.out.println(count);
    }

    private static boolean isTriangle(int a, int b, int c) {
        if (a >= b + c) return false;
        if (b >= a + c) return false;
        if (c >= a + b) return false;
        return true;
    }
}
