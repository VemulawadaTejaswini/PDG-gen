import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt() + 1;
        long C = sc.nextLong();

        long costs[] = new long[N];   // x_i
        int values[] = new int[N];  // v_i
        costs[0] = 0;  // 初期位置
        values[0] = 0;

        for (int i = 1; i < N; i++) {
            costs[i] = sc.nextLong();
            values[i] = sc.nextInt();
        }

        long value_accum[] = new long[N];
        long value_accum_rev[] = new long[N];
        value_accum[0] = 0;  // 初期位置
        value_accum_rev[0] = 0;
        for (int i = 1; i < N; i++) {
            value_accum[i] = value_accum[i-1] + values[i];
            value_accum_rev[i] = value_accum_rev[i-1] + values[N-i];
        }
        // //System.out.println(Arrays.toString(values));
        // //System.out.println(Arrays.toString(value_accum));
        // //System.out.println(Arrays.toString(value_accum_rev));

        // 時計回り側のコスパ
        long cw_cospa[] = new long[N];
        for (int i = 0; i < N; i++) {
            long cw_value = value_accum[i];
            long cw_cost = costs[i];
            cw_cospa[i] = cw_value - cw_cost;
        }

        // cw_cospa_bestpos[N] = 時計回り側の N までのコスパのなかで一番いいやつの位置
        int cw_cospa_bestpos[] = new int[N];
        cw_cospa_bestpos[0] = 0;
        for (int i = 1; i < N; i++) {
            if (cw_cospa[i] > cw_cospa[cw_cospa_bestpos[i-1]]) {
                cw_cospa_bestpos[i] = i;
            }
            else {
                cw_cospa_bestpos[i] = cw_cospa_bestpos[i-1];
            }
        }

        // 時計回り側のコスパ
        long cw_cospa2[] = new long[N];
        for (int i = 0; i < N; i++) {
            long cw_value = value_accum[i];
            long cw_cost = costs[i];
            cw_cospa2[i] = cw_value - cw_cost * 2;
        }

        // cw_cospa_bestpos[N] = 時計回り側の N までのコスパのなかで一番いいやつの位置
        int cw_cospa_bestpos2[] = new int[N];
        cw_cospa_bestpos2[0] = 0;
        for (int i = 1; i < N; i++) {
            if (cw_cospa2[i] > cw_cospa2[cw_cospa_bestpos[i-1]]) {
                cw_cospa_bestpos2[i] = i;
            }
            else {
                cw_cospa_bestpos2[i] = cw_cospa_bestpos2[i-1];
            }
        }
        //System.out.println(Arrays.toString(cw_cospa_bestpos));

        long score_max = 0;
        for (int i = 0; i < N; i++) {
            //System.out.println("cw, ccw = " + cw_cospa_bestpos[N-1-i] + ", " + i);

            // 反時計回り側のコスパ
            long ccw_value = value_accum_rev[i];
            long ccw_cost = (i == 0) ? 0 : (C - costs[N-i]);

            long score_cw  = cw_cospa2[cw_cospa_bestpos2[N-1-i]] + ccw_value - ccw_cost;
            //System.out.println("score_cw = " + score_cw);
            long score_ccw = cw_cospa[cw_cospa_bestpos[N-1-i]] + (ccw_value - ccw_cost * 2);
            //System.out.println("score_ccw = " + score_ccw);
            score_max = Math.max(score_max, score_cw);
            score_max = Math.max(score_max, score_ccw);
        }

        System.out.println(score_max);
    }
}
