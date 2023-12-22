import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0 ; i < n ; i++) {
            s[i] = sc.next();
        }
        Arrays.sort(s);
        for (int i = 0 ; i < n ; i++) {
            System.out.print(s[i]);
            if (i == n - 1) {
                System.out.print("\n");
            }
        }
    }

}
