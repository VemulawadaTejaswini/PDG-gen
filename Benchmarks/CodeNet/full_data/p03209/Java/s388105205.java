import java.util.Scanner;

public class Main {
    public static long[] ATSUSAdp = new long[51];

    static {
        ATSUSAdp[0] = 1L;
        for (int i = 0; i < 50; i++) {
            ATSUSAdp[i + 1] = 3L + 2 * ATSUSAdp[i];
        }
    }

    public static long[] PCOUNTdp = new long[51];

    static {
        PCOUNTdp[0] = 1;
        for (int i = 0; i < 50; i++) {
            PCOUNTdp[i + 1] = 1L + 2 * PCOUNTdp[i];
        }
    }


    public static long ans = 0L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();

        makeBGI(n, x);
        System.out.println(ans);
    }

//    private static String makeBG(int n) {
//        if (n == 0) return "P";
//
//        StringBuilder sb = new StringBuilder("B");
//        sb.append(makeBG(n - 1));
//        sb.append("P");
//        sb.append(sb);
//        sb.deleteCharAt(sb.length() - 1);
//        return sb.toString();
//    }

    /**
     * @param level ハンバーガーのレベル
     * @param rest  残りの食べるべき数
     * @return 新しい残り
     */
    private static long makeBGI(int level, long rest) {
        if(level==0) {
            if(rest > 0) ans++;
            return rest-1;
        }

        if (rest >= ATSUSAdp[level]) {
            rest -= ATSUSAdp[level];
            ans += PCOUNTdp[level];
            return rest;
        } else {
            rest--;//B part
            if(rest > 0) rest = makeBGI(level - 1, rest);// n-1 BG part
            if (rest > 0) {
                rest--;
                ans++;//P part
            }
            if(rest > 0) {
                rest = makeBGI(level - 1, rest);
                rest--;
            }
            return rest;
        }
    }
}