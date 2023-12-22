import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = scan.next();
        String t = scan.next();
        char[] x1 = s.toCharArray();
        char[] x2 = t.toCharArray();
        Arrays.sort(x1);
        String s1 = String.valueOf(x1);
        int length = x2.length;
        char[] x3 = new char[length];
        for (int i = 0; i < length; i++) {
            x3[i] = x2[length-i-1];
        }
        String t2 = String.valueOf(x3);
        if (s1.compareTo(t2) < 0 ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
