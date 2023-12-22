import java.io.PrintWriter;
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

    static class PairFromTo {
        public int mFromI;
        public int mFromJ;
        public int mToI;
        public int mToJ;

        public PairFromTo(int fromI, int fromJ, int toI, int toJ) {
            mFromI = fromI;
            mFromJ = fromJ;
            mToI = toI;
            mToJ = toJ;
        }

        public static PairFromTo of(int fromI, int fromJ, int toI, int toJ) {
            return new PairFromTo(fromI, fromJ, toI, toJ);
        }

        @Override
        public String toString() {
            return "PairFromTo{" +
                    "mFromI=" + mFromI +
                    ", mFromJ=" + mFromJ +
                    ", mToI=" + mToI +
                    ", mToJ=" + mToJ +
                    '}';
        }
    }

    public static String LCS(int[][] dp, char[] S, char[] T) {
        Stack<PairFromTo> st = new Stack<>();

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
//                    System.out.printf("from (%d, %d) to(%d,%d) \n", i-1, j, i, j);
                    st.push(PairFromTo.of(i-1, j, i, j));
                }
                else {
                    dp[i][j] = dp[i][j-1];
//                    System.out.printf("from (%d, %d) to(%d,%d) \n", i, j-1, i, j);
                    st.push(PairFromTo.of(i, j-1, i, j));
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
//                    System.out.printf("from (%d, %d) to(%d,%d) \n", i-1, j-1, i, j);
//                    System.out.printf(" %c \n", S[i]);
                    st.add(PairFromTo.of(i-1, j-1, i, j));
                }
            }
        }

//        d0(dp, S, T);

        int i = S.length-1;
        int j = T.length-1;
//        System.out.printf("cur (%d, %d)\n", i, j);

        while(st.size() > 0) {
            PairFromTo p = st.pop();
//            System.out.println(p);
            if(i == p.mToI && j == p.mToJ) {
                if(dp[i-1][j] != dp[i][j] && dp[i][j] != dp[i][j-1]) {
                    r = S[i] + r;
//                    System.out.println(r);
                }
                i = p.mFromI;
                j = p.mFromJ;
//                System.out.printf("cur (%d, %d)\n", i, j);
            }
        }
//        r = backTrack(dp, S.length-1, T.length-1);
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
