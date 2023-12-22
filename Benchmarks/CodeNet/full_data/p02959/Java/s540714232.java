import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(stdR.readLine());
        int[] A = new int[N + 1];
        int[] B = new int[N];
        String[] stra = stdR.readLine().split(" ");
        String[] strb = stdR.readLine().split(" ");
        for(int i = 0 ; i <= N ; i++) {
            A[i] = Integer.parseInt(stra[i]);
            if(i != N)B[i] = Integer.parseInt(strb[i]);
        }
        long counter = 0;
        for(int i = 0 ; i < N ; i++) {
            int stnum = Math.min(A[i], B[i]);
            A[i] -= stnum;
            B[i] -= stnum;
            counter += stnum;
            stnum = Math.min(A[i + 1], B[i]);
            A[i + 1] -= stnum;
            B[i] -= stnum;
            counter += stnum;
        }
        System.out.println(counter);
    }
}
