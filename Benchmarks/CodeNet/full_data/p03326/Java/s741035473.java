import java.util.Scanner;
import java.util.Arrays;

public class Main {

public static void main(String [] args){

        int N,M;
        long x,y,z;
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        M = input.nextInt();
        long[] para01 = new long[N+1];
        long[] para02 = new long[N+1];
        long[] para03 = new long[N+1];
        long[] para04 = new long[N+1];
        long[] para05 = new long[N+1];
        long[] para06 = new long[N+1];
        long[] para07 = new long[N+1];
        long[] para08 = new long[N+1];
        long[] ans = new long[8];
        for (int i=1; i<=N; i++) {
                x = input.nextLong();
                y = input.nextLong();
                z = input.nextLong();
                para01[i] = x+y+z;
                para02[i] = x+y-z;
                para03[i] = x-y+z;
                para04[i] = -x+y+z;
                para05[i] = x-y-z;
                para06[i] = -x-y+z;
                para07[i] = -x+y-z;
                para08[i] = -x-y-z;
        }

        Arrays.sort(para01);
        Arrays.sort(para02);
        Arrays.sort(para03);
        Arrays.sort(para04);
        Arrays.sort(para05);
        Arrays.sort(para06);
        Arrays.sort(para07);
        Arrays.sort(para08);

        for (int i=0; i< M; i++ ) {
                ans[0] +=para01[N-i];
                ans[1] +=para02[N-i];
                ans[2] +=para03[N-i];
                ans[3] +=para04[N-i];
                ans[4] +=para05[N-i];
                ans[5] +=para06[N-i];
                ans[6] +=para07[N-i];
                ans[7] +=para08[N-i];
        }

        Arrays.sort(ans);
        System.out.println(ans[7]);
}
}
