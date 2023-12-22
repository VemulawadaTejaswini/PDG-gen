import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            if (N % 3 == 0) {
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();

                for (int i = 0; i < N / 3; i++) {
                    sb1.append("aa.");
                    sb2.append("..b");
                }

                StringBuilder ans = new StringBuilder();
                for (int i = 0; i < N / 3; i++) {
                    ans.append(sb1.toString()).append("\n");
                    ans.append(sb2.toString()).append("\n");
                    ans.append(sb2.toString()).append("\n");
                }

                System.out.print(ans.toString());
                return;
            }

            String a40 = "....";
            String a41 = "aabc";
            String a42 = "ddbc";
            String a43 = "efgg";
            String a44 = "efhh";

            String a50 = ".....";
            String a51 = "aaehh";
            String a52 = "b.eii";
            String a53 = "bcff.";
            String a54 = ".cg.j";
            String a55 = "ddg.j";

            String a70 = ".......";
            String a71 = "aabbcc.";
            String a72 = "deeh...";
            String a73 = "d..h..i";
            String a74 = "f.jj..i";
            String a75 = "f...okk";
            String a76 = ".g..o.m";
            String a77 = ".g..nnm";

            for (int K = 0; K <= N / 7; K++) {
                for (int M = 0; M <= (N - K * 7) / 5; M++) {
                    if ((N - K * 7 - M * 5) % 4 != 0) {
                        continue;
                    }

                    int L = (N - K * 7 - M * 5) / 4;

                    StringBuilder[] sb = new StringBuilder[N];
                    for (int i = 0; i < N; i++) {
                        sb[i] = new StringBuilder();
                    }

                    for (int i = 0; i < L; i++) {
                        for (int j = 0; j < i; j++) {
                            sb[i * 4].append(a40);
                            sb[i * 4 + 1].append(a40);
                            sb[i * 4 + 2].append(a40);
                            sb[i * 4 + 3].append(a40);
                        }

                        sb[i * 4].append(a41);
                        sb[i * 4 + 1].append(a42);
                        sb[i * 4 + 2].append(a43);
                        sb[i * 4 + 3].append(a44);

                        for (int j = i + 1; j < L; j++) {
                            sb[i * 4].append(a40);
                            sb[i * 4 + 1].append(a40);
                            sb[i * 4 + 2].append(a40);
                            sb[i * 4 + 3].append(a40);
                        }

                        for (int j = 0; j < M; j++) {
                            sb[i * 4].append(a50);
                            sb[i * 4 + 1].append(a50);
                            sb[i * 4 + 2].append(a50);
                            sb[i * 4 + 3].append(a50);
                        }

                        for (int j = 0; j < K; j++) {
                            sb[i * 4].append(a70);
                            sb[i * 4 + 1].append(a70);
                            sb[i * 4 + 2].append(a70);
                            sb[i * 4 + 3].append(a70);
                        }
                    }

                    for (int i = 0; i < M; i++) {
                        for (int j = 0; j < L; j++) {
                            sb[L * 4 + i * 5].append(a40);
                            sb[L * 4 + i * 5 + 1].append(a40);
                            sb[L * 4 + i * 5 + 2].append(a40);
                            sb[L * 4 + i * 5 + 3].append(a40);
                            sb[L * 4 + i * 5 + 4].append(a40);
                        }

                        for (int j = 0; j < i; j++) {
                            sb[L * 4 + i * 5].append(a50);
                            sb[L * 4 + i * 5 + 1].append(a50);
                            sb[L * 4 + i * 5 + 2].append(a50);
                            sb[L * 4 + i * 5 + 3].append(a50);
                            sb[L * 4 + i * 5 + 4].append(a50);
                        }

                        sb[L * 4 + i * 5].append(a51);
                        sb[L * 4 + i * 5 + 1].append(a52);
                        sb[L * 4 + i * 5 + 2].append(a53);
                        sb[L * 4 + i * 5 + 3].append(a54);
                        sb[L * 4 + i * 5 + 4].append(a55);

                        for (int j = i + 1; j < M; j++) {
                            sb[L * 4 + i * 5].append(a50);
                            sb[L * 4 + i * 5 + 1].append(a50);
                            sb[L * 4 + i * 5 + 2].append(a50);
                            sb[L * 4 + i * 5 + 3].append(a50);
                            sb[L * 4 + i * 5 + 4].append(a50);
                        }

                        for (int j = 0; j < K; j++) {
                            sb[L * 4 + i * 5].append(a70);
                            sb[L * 4 + i * 5 + 1].append(a70);
                            sb[L * 4 + i * 5 + 2].append(a70);
                            sb[L * 4 + i * 5 + 3].append(a70);
                            sb[L * 4 + i * 5 + 4].append(a70);
                        }
                    }

                    for (int i = 0; i < K; i++) {
                        for (int j = 0; j < L; j++) {
                            sb[L * 4 + M * 5 + i * 7].append(a40);
                            sb[L * 4 + M * 5 + i * 7 + 1].append(a40);
                            sb[L * 4 + M * 5 + i * 7 + 2].append(a40);
                            sb[L * 4 + M * 5 + i * 7 + 3].append(a40);
                            sb[L * 4 + M * 5 + i * 7 + 4].append(a40);
                            sb[L * 4 + M * 5 + i * 7 + 5].append(a40);
                            sb[L * 4 + M * 5 + i * 7 + 6].append(a40);
                        }

                        for (int j = 0; j < M; j++) {
                            sb[L * 4 + M * 5 + i * 7].append(a50);
                            sb[L * 4 + M * 5 + i * 7 + 1].append(a50);
                            sb[L * 4 + M * 5 + i * 7 + 2].append(a50);
                            sb[L * 4 + M * 5 + i * 7 + 3].append(a50);
                            sb[L * 4 + M * 5 + i * 7 + 4].append(a50);
                            sb[L * 4 + M * 5 + i * 7 + 5].append(a50);
                            sb[L * 4 + M * 5 + i * 7 + 6].append(a50);
                        }

                        for (int j = 0; j < i; j++) {
                            sb[L * 4 + M * 5 + i * 7].append(a70);
                            sb[L * 4 + M * 5 + i * 7 + 1].append(a70);
                            sb[L * 4 + M * 5 + i * 7 + 2].append(a70);
                            sb[L * 4 + M * 5 + i * 7 + 3].append(a70);
                            sb[L * 4 + M * 5 + i * 7 + 4].append(a70);
                            sb[L * 4 + M * 5 + i * 7 + 5].append(a70);
                            sb[L * 4 + M * 5 + i * 7 + 6].append(a70);
                        }

                        sb[L * 4 + M * 5 + i * 7].append(a71);
                        sb[L * 4 + M * 5 + i * 7 + 1].append(a72);
                        sb[L * 4 + M * 5 + i * 7 + 2].append(a73);
                        sb[L * 4 + M * 5 + i * 7 + 3].append(a74);
                        sb[L * 4 + M * 5 + i * 7 + 4].append(a75);
                        sb[L * 4 + M * 5 + i * 7 + 5].append(a76);
                        sb[L * 4 + M * 5 + i * 7 + 6].append(a77);

                        for (int j = i + 1; j < M; j++) {
                            sb[L * 4 + M * 5 + i * 7].append(a70);
                            sb[L * 4 + M * 5 + i * 7 + 1].append(a70);
                            sb[L * 4 + M * 5 + i * 7 + 2].append(a70);
                            sb[L * 4 + M * 5 + i * 7 + 3].append(a70);
                            sb[L * 4 + M * 5 + i * 7 + 4].append(a70);
                            sb[L * 4 + M * 5 + i * 7 + 5].append(a70);
                            sb[L * 4 + M * 5 + i * 7 + 6].append(a70);
                        }
                    }

                    StringBuilder ans = new StringBuilder();
                    for (int i = 0; i < N; i++) {
                        ans.append(sb[i]).append("\n");
                    }

                    System.out.print(ans.toString());
                    return;
                }
            }

            System.out.println(-1);
        }
    }

}
