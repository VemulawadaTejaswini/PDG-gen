
import java.util.Scanner;

/**
 * Created by sonetsuyoshi on 2016/07/31.
 */
public class Main {

    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();

        int[] xs = new int[N];
        long[] counts = new long[A];
        for(int i = 0; i < N;i++) {
            xs[i] = scanner.nextInt();
        }

        for(int x: xs) {

            long[] newCounts = new long[A];
            for(int i = 0;i < A; i++) {
                newCounts[i] = counts[i];
            }

            int y = x % A;


//            System.out.println(x + " " + y);
//            for(long count: counts) System.out.print(count + " ");
//            System.out.println();

            for (int i = 0; i < A; i++) {
                counts[(i + y) % A] += newCounts[i];
            }

            counts[y] += 1;
//            for(long count: counts) System.out.print(count + " ");
//            System.out.println();
        }

        System.out.println(counts[0]);
    }
}