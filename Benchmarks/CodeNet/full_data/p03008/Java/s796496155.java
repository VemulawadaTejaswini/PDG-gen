import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ga = sc.nextInt();
        int sa = sc.nextInt();
        int ba = sc.nextInt();
        int gb = sc.nextInt();
        int sb = sc.nextInt();
        int bb = sc.nextInt();

        long[] dp_1 = new long[N+1];
        int[] w_1 = {ga, sa, ba};
        int[] v_1 = {gb-ga, sb-sa, bb-ba};
        for (int j=0;j<N+1;j++) {
            dp_1[j] = N-j;
        }
        for (int i=0;i<3;i++) {
            for (int j=0;j<N+1;j++) {
                if (0<=j-w_1[i]) {
                    dp_1[j] = Math.max(dp_1[j], dp_1[j-w_1[i]]+v_1[i]);
                }
                if (0<=j-1) {
                    dp_1[j] = Math.max(dp_1[j], dp_1[j-1]);
                }
            }
        }

        // System.out.println(Arrays.toString(w_1));
        // System.out.println(Arrays.toString(v_1));

        int N_max = (int)dp_1[N];
        long[] dp_2 = new long[N_max+1];
        int[] w_2 = {gb, sb, bb};
        int[] v_2 = {ga-gb, sa-sb, ba-bb};
        for (int j=0;j<N_max+1;j++) {
            dp_2[j] = N_max-j;
        }
        for (int i=0;i<3;i++) {
            for (int j=0;j<N_max+1;j++) {
                if (0<=j-w_2[i]) {
                    dp_2[j] = Math.max(dp_2[j], dp_2[j-w_2[i]]+v_2[i]);
                }
                if (0<=j-1) {
                    dp_2[j] = Math.max(dp_2[j], dp_2[j-1]);
                }
            }
        }

        // System.out.println(Arrays.deepToString(dp_2));

        // System.out.println(dp_1[3][N]);
        System.out.println(dp_2[N_max]);
    }
}