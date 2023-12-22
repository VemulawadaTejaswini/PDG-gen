import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = Integer.parseInt(stdin.nextLine());
        int[] a = Pattern.compile(" ").splitAsStream(stdin.nextLine()).mapToInt(Integer::parseInt).toArray();
        int[] b = Pattern.compile(" ").splitAsStream(stdin.nextLine()).mapToInt(Integer::parseInt).toArray();
        int[] c = a.clone();

        for (int i = 0; i < n; i++) {
            if (a[i] < b[i]) {
                b[i] -= a[i];
                a[i] = 0;
            } else {
                a[i] -= b[i];
            }
            a[i + 1] = Math.max(0, a[i + 1] - b[i]);
        }

        int ans = IntStream.range(0, n + 1).map(i -> c[i] - a[i]).sum();
        System.out.println(ans);
    }

}