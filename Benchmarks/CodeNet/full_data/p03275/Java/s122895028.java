import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int idx;
        if (a.length % 2 == 0) {
            idx = a.length / 2 + 1;
        } else {
            idx = a.length / 2;
        }

        System.out.println(a[idx]);
    }
}