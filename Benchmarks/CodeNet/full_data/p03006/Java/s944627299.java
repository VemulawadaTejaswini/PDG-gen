import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int ans = N;
        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                int l1 = i;
                int r1 = j;
                if (x[l1] > x[r1]) {
                    int tmp = l1;
                    l1 = r1;
                    r1 = tmp;
                }
                int dx1 = x[r1]-x[l1];
                int dy1 = y[r1]-y[l1];

                Set<Integer> leftSet = new HashSet<>();
                Set<Integer> rightSet = new HashSet<>();
                leftSet.add(l1);
                rightSet.add(r1);

                Set<Integer> used = new HashSet<>();
                used.add(l1);
                used.add(r1);
                int val = 1;

                for (int p = 0; p < N-1; p++) {
                    for (int q = p+1; q < N; q++) {
                        if (p == i && q == j) {
                            continue;
                        }
                        int l2 = p;
                        int r2 = q;
                        if (x[l2] > x[r2]) {
                            int tmp = l2;
                            l2 = r2;
                            r2 = tmp;
                        }
                        int dx2 = x[r2]-x[l2];
                        int dy2 = y[r2]-y[l2];
                        if (dx1 == dx2 && dy1 == dy2) {
                            if (leftSet.contains(r2)) {
                                leftSet.remove(r2);
                                leftSet.add(l2);
                            } else if (rightSet.contains(l2)) {
                                rightSet.remove(l2);
                                rightSet.add(r2);
                            } else {
                                leftSet.add(l2);
                                rightSet.add(r2);
                                val++;
                            }
                            used.add(l2);
                            used.add(r2);
                        }
                    }
                }
                val += N-used.size();
                ans = Math.min(ans, val);
            }
        }

        System.out.println(ans);
    }
}
