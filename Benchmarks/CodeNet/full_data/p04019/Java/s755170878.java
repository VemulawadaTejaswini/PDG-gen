
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int n = s.length;
        int[] a = new int[4];
        for (int i = 0 ; i < n ; i++) {
            if (s[i] == 'N') {
                a[0]++;
            } else if (s[i] == 'W') {
                a[1]++;
            } else if (s[i] == 'S') {
                a[2]++;
            } else {
                a[3]++;
            }
        }
        if ((a[0] == 0 && a[2] != 0) || (a[0] != 0 && a[2] == 0) || (a[1] == 0 && a[3] != 0) || (a[1] != 0 && a[3] == 0)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

}
