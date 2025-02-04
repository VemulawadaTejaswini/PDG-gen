import java.util.*;

public class Main{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in) {
                        int N = sc.nextInt(), M = sc.nextInt();
                        long[] a = new long[N], b = new long[N];
                        long[] c = new long[M], d = new long[M];
                        for(int i = 0; i < N; i++) {
                                a[i] = sc.nextLong();
                                b[i] = sc.nextLong();
                        }
                        for(int i = 0; i < M; i++) {
                                c[i] = sc.nextLong();
                                d[i] = sc.nextLong();
                        }
                        for(int i = 0; i < N; i++) {
                                long len = 1e11;
                                int ans = 0;
                                for(int j = 0; j < N; j++) {
                                        if(len > Math.abs(a[i] - c[j]) + Math.abs(b[i] - d[j])) {
                                                len = Math.abs(a[i] - c[j]) + Math.abs(b[i] - d[j]);
                                                ans = j;
                                        }
                                }
                                System.out.println(ans + 1);
                        }
                }
        }
}