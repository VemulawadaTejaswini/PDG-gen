import java.util.*;

class Main {
        private static int[] count, a;
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt(), K = sc.nextInt();
                a = new int[N];
                count = new int[N];
                for (int i = 0; i < N; i++) {
                        a[i] = sc.nextInt() - 1;
                }
                int ans = 0;
                if (a[0] != 0) {
                        ans++;
                        a[0] = 0;
                }
                while (true) {
                        for (int i = 0; i < N; i++) {
                                count[i] = 1 << 20;
                        }
                        count[0] = 0;
                        int maxcount = 0;
                        int maxindex = 0;
                        for (int i = 0; i < N; i++) {
//                              System.out.print(a[i] + " ");
                                int memo = make_tree(i);
                                if (memo > maxcount) {
                                        maxcount = memo;
                                        maxindex = i;
                                }
                        }
//                      System.out.println("");
                        if (maxcount <= K) {
                                break;
                        }
//                      System.out.println(maxindex + 1 + "  " + maxcount);
                        for (int i = 1; i < K; i++) {
                                maxindex = a[maxindex];
                        }
                        a[maxindex] = 0;
                        ans++;
                }
                System.out.println(ans);
        }
        private static int make_tree(int i){
                if (count[i] != 1 << 20) {
                        return count[i];
                } else {
                        return count[i] = make_tree(a[i]) + 1;
                }
        }
}