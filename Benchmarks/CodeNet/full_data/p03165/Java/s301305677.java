import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[][] cache;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();

        cache = new int[s.length()+1][t.length()+1];

        System.out.println(lcs(s, t));
    }

    private static String lcs(String s, String t) {
        getLengthOfLCS(s, t, s.length(), t.length());

        int len = cache[s.length()][t.length()];
        int temp = len;

        char[] ch = new char[len];

        int i = s.length();
        int j = t.length();

        while(i>0 && j>0) {
            if(s.charAt(i-1) == t.charAt(j-1)) {
                ch[len-1] = s.charAt(i-1);
                i--;
                j--;
                len--;
            } else if(cache[i-1][j] > cache[i][j-1]){
                i--;
            } else {
                j--;
            }
        }

        return new String(ch);
    }

    private static int getLengthOfLCS(String s, String t, int m, int n) {
        for(int i=1; i<=m; i++) {
            for (int j = 1; j <=n ; j++) {
                if(s.charAt(i-1) == t.charAt(j-1)) {
                    cache[i][j] = 1 + cache[i-1][j-1];
                } else {
                    cache[i][j] = Math.max(cache[i][j-1], cache[i-1][j]);
                }
            }
        }

        return cache[m][n];
    }
}
