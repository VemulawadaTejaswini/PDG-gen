import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int [] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = cin.nextInt();
        }
        int pos;
        for (pos = n - 1; pos > 1; pos--) {
            if (pos + 1 != p[pos]) break;
        }
        if (pos <= 1) {
            System.out.println(0);
        } else {
            System.out.println(p[pos]);
        }
    }
}
