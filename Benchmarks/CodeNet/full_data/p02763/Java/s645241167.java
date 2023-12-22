import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            char[] S = sc.next().toCharArray();
            int Q = sc.nextInt();

            List<CC> C = new ArrayList<>();
            {
                char c = S[0];
                int n = 1;
                for (int i = 1; i < N; i++) {
                    if (c == S[i]) {
                        n++;
                    } else {
                        C.add(new CC(c, n));
                        c = S[i];
                        n = 1;
                    }
                }
                C.add(new CC(c, n));
            }

            List<Integer> P = new ArrayList<>();
            {
                int p = 0;
                for (CC cc : C) {
                    P.add(p);
                    p += cc.n;
                }
            }

            StringBuilder ans = new StringBuilder();

            sc.nextLine();
            for (int q = 0; q < Q; q++) {
                String[] array = sc.nextLine().split(" ");

                if ("1".equals(array[0])) {
                    int i = Integer.valueOf(array[1]) - 1;
                    char c = array[2].charAt(0);
                    S[i] = c;

                    int pos = Collections.binarySearch(P, i);
                    if (pos < 0) {
                        pos = -(pos + 1);
                    }

                    CC cc = C.get(pos);
                    if (cc.c == c) {
                        continue;
                    }

                    if (cc.n == 1) {
                        cc.c = c;

                        if (pos < C.size() - 1 && C.get(pos + 1).c == c) {
                            cc.n += C.get(pos + 1).n;
                            C.remove(pos + 1);
                            P.remove(pos + 1);
                        }

                        if (pos > 0 && C.get(pos - 1).c == c) {
                            C.get(pos - 1).n += cc.n;
                            C.remove(pos);
                            P.remove(pos);
                        }
                    } else {
                        if (P.get(pos) == i) {
                            if (pos > 0 && C.get(pos - 1).c == c) {
                                cc.n--;
                                C.get(pos - 1).n++;
                                P.set(pos, i + 1);
                            } else {
                                cc.n--;
                                C.add(pos, new CC(c, 1));
                                P.add(pos + 1, i + 1);
                            }
                        } else if (P.get(pos) + cc.n - 1 == i) {
                            if (pos < P.size() - 1 && C.get(pos + 1).c == c) {
                                cc.n--;
                                C.get(pos + 1).n++;
                                P.set(pos + 1, i);
                            } else {
                                cc.n--;
                                C.add(pos + 1, new CC(c, 1));
                                P.add(pos + 1, i);
                            }
                        } else {
                            C.add(pos + 1, new CC(c, 1));
                            C.add(pos + 2, new CC(cc.c, cc.n - (i - P.get(pos) + 1)));
                            cc.n = i - P.get(pos);

                            P.add(pos + 1, i);
                            P.add(pos + 2, i + 1);
                        }
                    }
                } else {
                    int l = Integer.valueOf(array[1]) - 1;
                    int r = Integer.valueOf(array[2]) - 1;

                    int pos = Collections.binarySearch(P, l);
                    if (pos < 0) {
                        pos = -(pos + 1);
                    }

                    int pos2 = Collections.binarySearch(P, r);
                    if (pos2 < 0) {
                        pos2 = -(pos2 + 1);
                    }

                    Set<Character> set = new HashSet<>();
                    for (int i = pos; i <= pos2; i++) {
                        set.add(C.get(i).c);
                    }

                    //System.out.println(set.size());
                    ans.append(set.size()).append("\n");
                }
            }

            System.out.print(ans.toString());
        }
    }

    static class CC {

        char c;

        int n;

        public CC(char c, int n) {
            this.c = c;
            this.n = n;
        }

    }

}
