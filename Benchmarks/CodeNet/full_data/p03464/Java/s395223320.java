import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = Integer.parseInt(sc.next());
        int[] A = new int[K];
        for (int i=0;i<K;i++) {
            A[i] = Integer.parseInt(sc.next());
        }

        long tmp = 2;
        for (int i=K-1;i>=0;i--) {
            // if (tmp/A[i]==0) {
            //     System.out.println(-1);
            //     return;
            // }
            if (i!=0) {
                tmp = (tmp+A[i]-1)/A[i]*A[i];
            } else {
                tmp = (tmp+A[i]-1)/A[i]*A[i];
                System.out.println(tmp+" "+(tmp+A[i]-1));
            }
            // if (tmp%A[i]!=0) {
            //     System.out.println(-1);
            //     return;
            // }
        }
    }
}