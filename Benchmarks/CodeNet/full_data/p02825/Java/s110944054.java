import java.util.Scanner;

/**
 * Domino Quality
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            if (N == 2) {
                System.out.println(-1);
                return;
            }

            if (N == 3) {
                System.out.println("aa.");
                System.out.println("..a");
                System.out.println("..a");
                return;
            }

            StringBuilder ans = new StringBuilder();

            int M = N / 4;
            if (N % 4 != 0) {
                M--;
            }

            for (int i = 0; i < M; i++) {
                StringBuilder[] sb = new StringBuilder[4];
                for (int j = 0; j < sb.length; j++) {
                    sb[j] = new StringBuilder();
                }

                for (int j = 0; j < i; j++) {
                    blank4(sb);
                }
                place4(sb);
                for (int j = i + 1; j < M; j++) {
                    blank4(sb);
                }

                if (N % 4 == 1) {
                    blank5(sb);
                } else if (N % 4 == 2) {
                    blank6(sb);
                } else if (N % 4 == 3) {
                    blank7(sb);
                }

                for (int j = 0; j < sb.length; j++) {
                    ans.append(sb[j]).append("\n");
                }
            }

            if (N % 4 != 0) {
                StringBuilder[] sb = new StringBuilder[N % 4 + 4];
                for (int j = 0; j < sb.length; j++) {
                    sb[j] = new StringBuilder();
                }

                for (int j = 0; j < M; j++) {
                    blank4(sb);
                }

                if (N % 4 == 1) {
                    place5(sb);
                } else if (N % 4 == 2) {
                    place6(sb);
                } else if (N % 4 == 3) {
                    place7(sb);
                }

                for (int j = 0; j < sb.length; j++) {
                    ans.append(sb[j]).append("\n");
                }
            }

            System.out.print(ans.toString());
        }
    }

    static void place4(StringBuilder[] sb) {
        sb[0].append("aabc");
        sb[1].append("ddbc");
        sb[2].append("bcaa");
        sb[3].append("bcdd");
    }

    static void place5(StringBuilder[] sb) {
        sb[0].append("aabba");
        sb[1].append("bcc.a");
        sb[2].append("b..cb");
        sb[3].append("a..cb");
        sb[4].append("abbaa");
    }

    static void place6(StringBuilder[] sb) {
        sb[0].append("aabc..");
        sb[1].append("ddbc..");
        sb[2].append("..aabc");
        sb[3].append("..ddbc");
        sb[4].append("bc..aa");
        sb[5].append("bc..dd");
    }

    static void place7(StringBuilder[] sb) {
        sb[0].append("aabbcc.");
        sb[1].append("dd.dd.a");
        sb[2].append("..d..da");
        sb[3].append("..d..db");
        sb[4].append("dd.dd.b");
        sb[5].append("..d..dc");
        sb[6].append("..d..dc");
    }

    static void blank4(StringBuilder[] sb) {
        for (int i = 0; i < sb.length; i++) {
            sb[i].append("....");
        }
    }

    static void blank5(StringBuilder[] sb) {
        for (int i = 0; i < sb.length; i++) {
            sb[i].append(".....");
        }
    }

    static void blank6(StringBuilder[] sb) {
        for (int i = 0; i < sb.length; i++) {
            sb[i].append("......");
        }
    }

    static void blank7(StringBuilder[] sb) {
        for (int i = 0; i < sb.length; i++) {
            sb[i].append(".......");
        }
    }

}
