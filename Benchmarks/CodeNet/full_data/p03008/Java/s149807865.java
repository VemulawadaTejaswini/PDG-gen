import java.util.*;

class Main{
    static long mod = 1000000007;
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int[] ris = {sc.nextInt(), 0,0,0};
        int[] a_trans = new int[3];
        int[] b_trans = new int[3];
        double[] rate = new double[3];
        for(int i=0;i<3;i++){
            a_trans[i] = sc.nextInt();
        }
        for(int i=0;i<3;i++){
            b_trans[i] = sc.nextInt();
            rate[i] = (double)a_trans[i]/b_trans[i];
        }
        if(rate[0]<1 || rate[1]<1 || rate[2]<1){
            String str = "g";
            if(rate[1]<rate[0])str = "s";
            if(rate[2]<Math.min(rate[0], rate[1]))str = "b";
            ris = exchange(ris, a_trans, b_trans, str);
        }
        if(rate[0]>1 || rate[1]>1 || rate[2]>1){
            String str = "g";
            if(rate[1]>rate[0])str = "s";
            if(rate[2]>Math.max(rate[0], rate[1]))str = "b";
            ris = exchange(ris, b_trans, a_trans, str);
        }
        System.out.println(ris[0]);
    }

    public static int[] exchange(int[] R, int[] a, int[] b, String str) {
        int p = 0;
        if(str.equals("g"))p=0;
        if(str.equals("s"))p=1;
        if(str.equals("b"))p=2;
        int[] result = R;
        if(R[0] > a[p]){
            int tmp = R[0]/a[p];
            result[0] -= a[p]*tmp;
            result[0] += b[p]*tmp;
        }
        return result;
    }
}


