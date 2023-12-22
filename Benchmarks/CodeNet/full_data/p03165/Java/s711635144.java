import java.util.*;

public class Main {
    private static String solve(String s, String t) {
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        int[][] lcsLen =  new int[sa.length+1][ta.length+1];

        for (int i = 0; i < sa.length; i++)
            for (int j = 0; j < ta.length; j++) {
                if (sa[i] == ta[j]) lcsLen[i+1][j+1] = 1 + lcsLen[i][j];
                else lcsLen[i+1][j+1] = Math.max(lcsLen[i+1][j], lcsLen[i][j+1]);
            }

        int maxLen = lcsLen[sa.length-1][ta.length-1];
        if (maxLen == 0) return "";
        char[] lcs = new char[maxLen+1];

        int i = sa.length;
        int j = ta.length;
        int k = maxLen;
        while (k >= 0) {
            if (j > 0 && lcsLen[i][j] == lcsLen[i][j-1]) j--;
            else if (i > 0 && lcsLen[i][j] == lcsLen[i-1][j]) i--;
            else {
                lcs[k--] = sa[i-1];
                i--;
                j--;
            }
        }

        return new String(lcs);
    }

    public static void main(String[] args) {
        String s, t;
        try (Scanner scanner = new Scanner(System.in)) {
            s = scanner.nextLine();
            t = scanner.nextLine();
        }

        String result = solve(s, t);
        System.out.println(result);
    }
}
