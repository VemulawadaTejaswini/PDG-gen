import java.util.*;
public class Main {

    public static void main(String[] args) {
        //data input
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        long[] A = new long[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        long[] B = new long[N];
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }


        //logic
        int ct = (N - 2 <= 0)? 0 : N - 2;
        for (int i = 0; ct >= 0 && i < N; i++) {
            if (A[i] > B[i]) {
                int pCt = ct;
                for (int j = i + 1; j < N; j++) {
                    if (A[j] > B[j] && A[i] <= B[j]) {
                        //swap
                        ct-=1;
                        if (ct < 0) {
                            ct=-999;
                            break;
                        }
                        long work = B[i];
                        B[i] = B[j];
                        B[j] = B[i];
                        break;
                    }
                }
                if (pCt == ct) {//交換できなかった場合
                    int pCt2 = ct;
                    for (int j = i - 1; j >= 0; j--) {
                        if (A[j] > B[j] && A[i] <= B[j]) {
                            //swap
                            ct-=1;
                            if (ct < 0) {
                                ct=-999;
                                break;
                            }
                            long work = B[i];
                            B[i] = B[j];
                            B[j] = B[i];
                            break;
                        }
                    }
                    if (pCt2 == ct) ct = -999;
                }
            }
        }
        System.out.println((ct >= 0)? "Yes": "No");
    }
}