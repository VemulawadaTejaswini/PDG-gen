import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int C = sc.nextInt();
        String S = sc.next();
        char[] c = S.toCharArray();
        int[][] left = new int[N+1][2]; // left[0][:] : not worked, left[1][:] : worked
        for (int i=0;i<N;i++) {
            if (c[i]=='o' && i>=C) {
                left[i+1][0] = Math.max(left[i][0], left[i-C][1]);

                left[i+1][1] = Math.max(left[i][0]+1, left[i][1]);
                left[i+1][1] = Math.max(left[i+1][1], left[i-C][1]+1);
                left[i+1][1] = Math.max(left[i+1][1], left[i-C][0]+1);
            } else if (c[i]=='o' && i<C) {
                left[i+1][0] = left[i][0];
                left[i+1][1] = Math.max(left[i][0]+1, left[i][1]);
            } else { // c[i]=='x'
                left[i+1][0] = left[i][0];
                left[i+1][1] = left[i][1];
            }
        }

        int[][] right = new int[N+1][2]; // right[0][:] : not worked, right[1][:] : worked
        for (int i=N;i>=1;i--) {
            if (c[i-1]=='o' && i<=N-C) {
                right[i-1][0] = Math.max(right[i][0], right[i+C][1]);

                right[i-1][1] = Math.max(right[i][0]+1, right[i][1]);
                right[i-1][1] = Math.max(right[i-1][1], right[i+C][1]+1);
                right[i-1][1] = Math.max(right[i-1][1], right[i+C][0]+1);
            } else if (c[i-1]=='o' && i>N-C) {
                right[i-1][0] = right[i][0];
                right[i-1][1] = Math.max(right[i][0]+1, right[i][1]);
            } else { // c[i]=='x'
                right[i-1][0] = right[i][0];
                right[i-1][1] = right[i][1];
            }
        }

        int[][] new_left = new int[N][2];
        for (int i=0;i<N;i++) {
            new_left[i][0] = left[i+1][0];
            // new_left[i][1] = left[i+1][1];
            new_left[i][1] = Math.max(left[i+1][0], left[i+1][1]);
        }

        ////////////////////// ??
        for (int i=0;i<N+1;i++) {
            right[i][1] = Math.max(right[i][0], right[i][1]);
        }


        // System.out.println(Arrays.deepToString(new_left));
        // System.out.println(Arrays.deepToString(right));

        int[] imos = new int[N+1];
        for (int i=0;i<N-C-1;i++) {
            if (new_left[i][1]+right[i+C+1][1]<K) {
                imos[i+1]++;
                imos[i+C+1]--;
            }
        }

        for (int i=0;i<C;i++) {
            if (right[i+1][1]<K) {
                imos[0]++;
                imos[i+1]--;
            }
        }

        for (int i=N-1;i>=N-C;i--) {
            if (left[i][1]<K) {
                imos[i]++;
                imos[N]--;
            }
        }


        // for (int i=0;i<N;i++) {
        //     if (new_left[i][1]>=K) {
        //         imos[i]++;
        //         imos[N]--;
        //     }
        // }

        // for (int i=N-1;i>=0;i--) {
        //     if (right[i][1]>=K) {
        //         imos[0]++;
        //         imos[i+1]--;
        //     }
        // }

        for (int i=0;i<N;i++) {
            imos[i+1] = imos[i]+imos[i+1];
        }

        // System.out.println(Arrays.toString(imos));
        for (int i=0;i<N;i++) {
            if (imos[i]==C) System.out.println(i+1);
        }
    }
}