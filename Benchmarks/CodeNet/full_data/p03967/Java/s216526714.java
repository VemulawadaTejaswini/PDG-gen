import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        char[] d = S.toCharArray();
        int p_count = 0;
        int g_count = 0;
        for (int i = 0; i < d.length; i++) {
            if (d[i] == 'p') {
                p_count += 1;
            } else {
                g_count += 1;
            }
        }
        int diff = g_count - p_count;
        if (diff == 0 || diff == 1) {
            System.out.println(0);
        } else {
            System.out.println(diff / 2);
        }
    }
}
