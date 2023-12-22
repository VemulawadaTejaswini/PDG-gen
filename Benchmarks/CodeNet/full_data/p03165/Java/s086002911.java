import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static public char[] S;
    static public char[] T;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String s = sc.nextLine();
        String t = sc.nextLine();
        s = ' ' + s;
        t = ' ' + t;
        S = s.toCharArray();
        T = t.toCharArray();

        int[][] dp = new int[S.length][T.length];
        String r = LCS(dp, S, T);

//        d0(dp, S, T);

        pw.println(r);
        pw.close();
    }

    static class Pair<L, R> {
        public L mL;
        public R mR;
        public Pair(L l, R r) {
            mL = l;
            mR = r;
        }

        public static <L, R> Pair<L, R> of(L l, R r) {
            return new Pair<L, R>(l, r);
        }
    }

    public static String LCS(int[][] dp, char[] S, char[] T) {
//        ArrayList<Pair<Integer, Integer>> al = new ArrayList<>();
//        Stack<Pair<Integer, Integer>> st = new Stack<>();

//        for(int i=0; i<dp.length; ++i) {
//            for(int j=0; j<dp[0].length; ++j) {
//                dp[i][j] = -30;
////                dp[i][j] = -4000;
////                dp[i][j] = Integer.MIN_VALUE;
//            }
//        }

        String r = "";
//        dp[0][0] = 0;
        for(int i=1; i<S.length; ++i) {
            for(int j=1; j<T.length; ++j) {
                if(dp[i][j-1] < dp[i-1][j]) {
                    dp[i][j] = dp[i-1][j];
//                    System.out.printf("cur(%d,%d) from (%d, %d)\n", i, j, i-1, j);
//                    st.push(Pair.of(i-1, j));
                }
                else {
                    dp[i][j] = dp[i][j-1];
//                    System.out.printf("cur(%d,%d) from (%d, %d)\n", i, j, i, j-1);
//                    st.push(Pair.of(i, j-1));
                }

//                if(dp[i][j] < dp[i-1][j]) {
//                    dp[i][j] = dp[i-1][j];
//                    System.out.printf("from (%d, %d)\n", i-1, j);
//                    st.push(Pair.of(i-1, j));
//                }
//
//                if(dp[i][j] < dp[i][j-1]) {
//                    dp[i][j] = dp[i][j-1];
//                    System.out.printf("from (%d, %d)\n", i, j-1);
//                    st.push(Pair.of(i, j-1));
//                }

                // (dp[i][j] < dp[i-1][j-1] + 1)
                // 이부분이 앞에서 풀었던 DP 문제들과 달라지는 부분입니다.
                // S에 속해있는 특정 문제가, T 에서 2회 이상 들어 있다면,
                // 위의 로직이 없는 경우에, dp[i][j] 값이 1더 증가 하게 됩니다.
                if(S[i] == T[j] && (dp[i][j] < dp[i-1][j-1] + 1)) {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + 1;
//                    System.out.printf("from daekak (%d, %d)\n", i-1, j-1);
//                    System.out.printf(" %c \n", S[i]);
//                    st.add(Pair.of(i-1, j-1));
                }
            }
        }

        r = backTrack(dp, S.length-1, T.length-1);

//        int i = S.length-1;
//        int j = T.length-1;
//        int prvI = Integer.MAX_VALUE;
//        int prvJ = Integer.MAX_VALUE;
//
//        while(st.size() > 0) {
//            Pair<Integer, Integer> p = st.pop();
//            if(i != prvI || j != prvJ) {
//                if(dp[i-1][j] != dp[i][j] && dp[i][j] != dp[i][j-1]) {
//                    r = S[i] + r;
//                    System.out.printf("(%d,%d) %s\n", i, j, r);
//                    d0(dp, S, T);
//                }
//                prvI = i;
//                prvJ = j;
//            }
//
//            int fromI = (int) p.mL;
//            int fromJ = (int) p.mR;
//
//            System.out.printf("cur (%d,%d)\n", i, j);
//            System.out.printf("new (%d,%d)\n", fromI, fromJ);
//
//            if(0 < fromI && 0 < fromJ && fromI <=i && fromJ <=j) {
//                i = Math.min(fromI, i);
//                j = Math.min(fromJ, j);
//
//
//                if(i != prvI || j != prvJ) {
//                    System.out.printf("(%d,%d)%c(%d,%d)\n", prvI, prvJ, '→', i, j);
//                    d0(dp, S, T);
//                }
//            }
//        }
//        System.out.printf("dp[S][T] (%d,%d) %d\n", S.length, T.length, dp[S.length-1][T.length-1]);

        return r;
    }

    public static String backTrack(int[][] dp, int i, int j) {
        if(!(0<i && 0<j))
            return "";

        if(dp[i-1][j] != dp[i][j] && dp[i][j] != dp[i][j-1]) {
//            System.out.printf("(%d,%d) %s\n", i, j, S[i]);
            return backTrack(dp, i-1, j-1) +  S[i];
        }

        String r1 = backTrack(dp, i-1, j);
        String r2 = backTrack(dp, i, j-1);

        if(r1.length() > r2.length())
            return r1;

        return r2;
    }

    public static void d0(int[][] dp, char[] S, char[] T) {
        System.out.print("      ");

        for(int j=0; j<dp[0].length; ++j){
            System.out.printf("%c%3d|", T[j], j);
        }
        System.out.println();

        for(int i=0; i<dp.length; ++i){
            System.out.printf("%c %3d|", S[i], i);
            for(int j=0; j<dp[0].length; ++j){
                System.out.printf(" %3d ", dp[i][j]);
            }
            System.out.println();
        }
    }
}
