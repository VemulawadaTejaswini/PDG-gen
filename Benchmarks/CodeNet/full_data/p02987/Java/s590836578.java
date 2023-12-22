import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final int MAX = 100100;
    InputStream in = System.in;
    PrintStream out = System.out;
    // static int dp[][] = new int[MAX][MAX];

    public void _main(String[] args) {
        Scanner sc = new Scanner(in);
        String S = sc.next();
        char[] s = S.toCharArray();
        Arrays.sort(s);
        if (s[0]==s[1]&&s[2]==s[3]&&s[1]!=s[2]) out.println("Yes");
        else out.println("No");
    }

    public static void main(String[] args) {
        new Main()._main(args);
    }
}
