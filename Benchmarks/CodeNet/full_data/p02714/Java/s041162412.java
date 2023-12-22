
import java.util.*;
import java.io.*;

/**
 * Made by egor https://github.com/chermehdi/egor.
 * 
 * @author azize
   
 */
public class Main {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        char[] arr = in.next().toCharArray();
        int[][] count = new int[n + 1][3];

        for (int i = arr.length - 1; i >= 0; --i) {
            for (int j = 0; j < 3; ++j) {
                count[i][j] = count[i + 1][j];
            }
            ++count[i][get(arr[i])];
        }
        long ans = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (arr[i] == arr[j]) continue;
                ans += count[j + 1][cmp(arr[i], arr[j])];
                if (j + j - i < n && get(arr[j + j - i]) == cmp(arr[i], arr[j])) {
                    --ans;
                }
            }
        }

        out.println(ans);
    }

    public static int cmp(char a, char b) {
        return 3 - get(a) - get(b);
    }

    public static int get(char c) {
        switch (c) {
            case 'R' : return 0;
            case 'G' : return 1;
            case 'B' : return 2;
        }

        System.err.println("!!");
        return -1; // should never get here
    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
        }
    }
}
