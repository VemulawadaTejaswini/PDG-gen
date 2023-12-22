import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(stdR.readLine());
        int[] A = new int[L];
        long death = 0;
        int pcount = 0;
        for(int i = 0 ; i < L ; i++) {
            A[i] = Integer.parseInt(stdR.readLine());
            death += A[i];
            if(A[i] != 0 && A[i] % 2 == 0)pcount++;
        }
        long start = death;
        for(int i = 0 ; i < L ; i++) {
            long nowdeath = start;
            for(int j = i ; j >= 0 ; j--) {
                death = Math.min(death, nowdeath - A[j]);
                if(A[j] == 0) {
                    nowdeath++;
                }else {
                    nowdeath -= (A[j] / 2 * 2 + (A[j] % 2 == 1 ? 1 : -1 ));
                }
                death = Math.min(death, nowdeath);
                if(pcount >= 2) {
                    death = Math.min(death, nowdeath - A[j] - 1);
                }
            }
            nowdeath = start;
            for(int j = i ; j < L ; j++) {
                death = Math.min(death, nowdeath - A[j]);
                if(A[j] == 0) {
                    nowdeath++;
                }else {
                    nowdeath -= (A[j] / 2 * 2 + (A[j] % 2 == 1 ? 1 : -1 ));
                }
                death = Math.min(death, nowdeath);
                if(pcount >= 2) {
                    death = Math.min(death, nowdeath - A[j] - 1);
                }
            }
        }
        System.out.println(death);
    }
}
