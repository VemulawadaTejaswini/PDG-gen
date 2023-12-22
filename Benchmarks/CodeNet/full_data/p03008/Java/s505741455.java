import java.util.*;

class Main{
    static long mod = 1000000007;
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int[] ris = {sc.nextInt(), 0,0,0};
        int[] a_trans = new int[3];
        int[] b_trans = new int[3];
        double[][] rate = new double[3][2];
        for(int i=0;i<3;i++){
            a_trans[i] = sc.nextInt();
        }
        for(int i=0;i<3;i++){
            b_trans[i] = sc.nextInt();
            rate[i][0] = (double)a_trans[i]/b_trans[i];
            rate[i][1] = i;
        }
        Arrays.sort(rate, (a,b)->Double.compare(a[0], b[0]));
        if(rate[0][0]<1 || rate[1][0]<1 || rate[2][0]<1){
            for(int i=0;i<rate.length;i++){
                ris = exchange_to_coin(ris, a_trans, (int)rate[i][1]);
            }
            ris = exchange_to_nuts(ris, b_trans);
        }
        if(rate[0][0]>1 || rate[1][0]>1 || rate[2][0]>1){
            for(int i=0;i<rate.length;i++){
                ris = exchange_to_coin(ris, b_trans, (int)rate[2-i][1]);
            }
            ris = exchange_to_nuts(ris, a_trans);
        }
        System.out.println(ris[0]);
    }

    public static int[] exchange_to_coin(int[] R, int[] a, int type) {
        int p = type;
        int[] result = R;
        if(R[0] > a[p]){
            int tmp = R[0]/a[p];
            result[0] -= a[p]*tmp;
            result[p+1] += tmp;
        }
        return result;
    }

    public static int[] exchange_to_nuts(int[] R, int[] a) {
        int[] result = R;
        for(int i=1;i<=3;i++){
            result[0] += result[i] * a[i-1];
            result[i] = 0;
        }
        return result;
    }
}