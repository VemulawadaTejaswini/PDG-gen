import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char a[] = new char[N+1];
        String s = sc.next();
        a = Arrays.copyOf(s.toCharArray(), N+1);
        char tmp = a[0];

        int result = 0;

        for (int i = 1; i <= N; i++) {
            if (a[i] != tmp) {
                result++;
                tmp = a[i];
            }
        }

        System.out.println(result);
    }
}
