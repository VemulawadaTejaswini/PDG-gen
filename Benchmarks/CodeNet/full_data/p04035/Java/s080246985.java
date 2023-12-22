import java.util.*;

class Main {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt(), L = sc.nextInt();
                int[] A = new int[N];
                boolean possibleflag = false;
                int idx = 0;
                for (int i = 0; i < N; i++) {
                        A[i] = Integer.parseInt(sc.next());
                        if (i != 0) {
                                if (A[i] + A[i-1] >= L) {
                                        possibleflag = true;
                                        idx = i - 1;
                                        break;
                                }
                        }
                }
                if (!possibleflag) {
                        System.out.println("Impossible");
                        return;
                }
                StringBuilder str = new StringBuilder();
                str.append("Possible\n");
                for (int i = 0; i < N - 1; i++) {
                        if (i != idx) {
                                str.append(i+1 + "\n");
                        }
                }
                str.append(idx + 1);
                System.out.println(str);
        }
}