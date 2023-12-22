import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int start = S.indexOf("#");
        int end = S.lastIndexOf(".");
        if (start < 0 || end < 0 || start > end) {
            out.println(0);
            out.close();
        } else {
            int blackAll = 0;
            for (int i = 0; i < N; i++) {
                if ('#' == S.charAt(i)) {
                    blackAll++;
                }
            }
            int ans = N;
            int black0ToI = '#' == S.charAt(0) ? 1 : 0;
            int whiteIplus1ToN = N - blackAll;
            whiteIplus1ToN -= '.' == S.charAt(0) ? 1 : 0;
            for (int i = 1; i < N; i++) {
                ans = Math.min(ans, black0ToI + whiteIplus1ToN);
                if ('#' == S.charAt(i)) {
                    black0ToI++;
                } else {
                    whiteIplus1ToN--;
                }
            }
            ans = Math.min(ans, black0ToI + whiteIplus1ToN);
            out.println(ans);
            out.close();
        }
    }
}
