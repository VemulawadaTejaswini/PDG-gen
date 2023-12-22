import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int maxw = sc.nextInt();
        Sina sina[] = new Sina[4];
        for (int i = 0; i < 4; i++) {
            sina[i] = new Sina();
        }

        long w1 = sc.nextLong();
        int v1 = sc.nextInt();
        sina[0].vs.add(v1);
        for (int i = 1; i < n; i++) {
            sina[(int) (sc.nextLong() - w1)].vs.add(sc.nextInt());
        }

        for (int i = 0; i < 4; i++) {
            sina[i].vs.sort((o1, o2) -> o2 - o1);

            sina[i].sums = new long[sina[i].vs.size() + 1];

            sina[i].sums[0] = 0;
            int j = 1;
            for (int v : sina[i].vs) {
                sina[i].sums[j] = sina[i].sums[j - 1] + v;
                j++;
            }
        }

        long ans = 0;
        for (int a = 0; a <= sina[0].vs.size(); a++) {
            long noww = w1 * a;
            if (maxw < noww) {
                break;
            }
            for (int b = 0; b <= sina[1].vs.size(); b++) {
                noww += (w1 + 1) * b;
                if (maxw < noww) {
                    break;
                }
                for (int c = 0; c <= sina[2].vs.size(); c++) {
                    noww += (w1 + 2) * c;
                    if (maxw < noww) {
                        break;
                    }
                    for (int d = 0; d <= sina[3].vs.size(); d++) {
                        noww += (w1 + 3) * d;
                        if (maxw < noww) {
                            break;
                        }
                        ans =
                            Math.max(ans, sina[0].sums[a] + sina[1].sums[b] + sina[2].sums[c]
                                + sina[3].sums[d]);
                    }
                }
            }
        }

        System.out.println(ans);
    }

    private class Sina {
        List<Integer> vs;
        long sums[];

        public Sina() {
            vs = new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
