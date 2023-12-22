import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        Pair[] pairs = new Pair[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            Pair p = new Pair();
            p.from = a[i];
            p.end = b[i];
            pairs[i] = p;
        }

        Arrays.sort(pairs);


        long w = 0;
        for (int i = 0; i < n; i++) {
            w += (long) pairs[i].from;
        }

        if (w > pairs[pairs.length - 1].end) {
            System.out.println("No");
            return;
        }

        int z = 0;
        for (int i = 0 ; i < n ; i++) {
            z += (long) pairs[i].from;
            if (z > pairs[i].end) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");

    }

}

class Pair implements Comparable {
    int from;
    int end;

    @Override
    public int compareTo(Object other) {
        Pair otherpair = (Pair) other;
        return end - otherpair.end;
    }
}