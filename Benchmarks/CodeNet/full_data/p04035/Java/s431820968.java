import java.util.*;

class Main {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt(), L = sc.nextInt();
                int[] A = new int[N];
                for (int i = 0; i < N; i++) {
                        A[i] = Integer.parseInt(sc.next());
                }
                boolean possibleflag = false;
                int idx = 0;
                for (int i = 1; i < N; i++) {
                        if (A[i] + A[i-1] >= L) {
                                possibleflag = true;
                                idx = i - 1;
                        }
                }
                if (!possibleflag) {
                        System.out.println("Impossible");
                        return;
                }
                System.out.println("Possible");
                for (int i = 0; i < N - 1; i++) {
                        if (i != idx) {
                                System.out.println(i + 1);
                        }
                }
                System.out.println(idx + 1);
        }
}