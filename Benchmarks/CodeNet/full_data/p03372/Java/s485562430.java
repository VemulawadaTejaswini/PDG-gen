import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long C = sc.nextLong();
        long[] x = new long[N];
        int[]  v = new int[N];

        for (int i = 0; i <N ; i++) {
            x[i]=sc.nextLong();
            v[i] = sc.nextInt();
        }

        long[] clockSingle = new long[N+1];
        long[] anticlockSingle = new long[N+1];
        long[] clockDual = new long[N+1];
        long[] anticlockDual = new long[N+1];



        long vSum = 0;
        long single =0;
        long singleMax =0;
        long dual =0;
        long dualMax= 0;
        for (int i = 0; i <N ; i++) {
            vSum +=v[i];
            single = vSum- x[i];
            dual = vSum -2*x[i];
            singleMax = Math.max(singleMax, single);
            dualMax = Math.max(dualMax,dual);
            clockSingle[i] = singleMax;
            clockDual[N-i-1] = dualMax;
        }
        vSum=0;
        single=0;dual=0;singleMax=0;dualMax=0;

        for (int i = N-1; i >=0 ; i--) {
            vSum +=v[i];
            single = vSum- (C-x[i]);
            dual = vSum -2*(C-x[i]);
            singleMax = Math.max(singleMax, single);
            dualMax = Math.max(dualMax,dual);
            anticlockSingle[N-1-i] = singleMax;
            anticlockDual[i] = dualMax;
        }

        long ans = 0;

        for (int i = 0; i <N ; i++) {

            ans = Math.max(ans , clockSingle[i]+anticlockDual[i+1]);
            ans = Math.max(ans , anticlockSingle[i]+clockDual[i+1]);
        }

        System.out.println(ans);
    }
}
