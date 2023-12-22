import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        int ans = 0;

        int BhogeA = 0;
        int hogeA = 0;
        int Bhoge = 0;
        int AB = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            BhogeA += count(s, true, true);
            hogeA += count(s, true, false);
            Bhoge += count(s, false, true);
            AB += s.length() - s.replace("AB", "$").length();
        }
        ans = AB + Math.min(Math.min(hogeA, Bhoge) + BhogeA, (N + BhogeA) / 2);
        ans -= hogeA + Bhoge == 0 ? 1 : 0;
        out.println(ans);
        out.close();
    }

    private static int count(String s, boolean endsWithA, boolean startsWithB) {
        boolean a = endsWithA ? s.endsWith("A") : !s.endsWith("A");
        boolean b = startsWithB ? s.startsWith("B") : !s.startsWith("B");
        return a && b ? 1 : 0;
    }
}
