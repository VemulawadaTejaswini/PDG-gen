import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve2(N, K, A));
    }

    private static int solve2(int N, int K, int[] A) {
        int count = 0;
        int minIdx = -1, maxIdx = -1;

        for(int i=0; i<N; i++) {
            if(A[i] == 1) {
                minIdx = i;
                maxIdx = i;
                break;
            }
        }

        //if maxでぴったしならreverse
        //minでぴったしならそのまま，あまるならあまらせる
        //maxは旧法と同様
        if ( (A.length-1-maxIdx)%(K-1) == 0) {
            int[] aClone = A.clone();
            for (int i=0; i<N; i++) {
                A[i] = aClone[N-1-i];
            }
        }

        if (minIdx%(K-1) == 0) {
            count = minIdx/(K-1);
        } else {
            count = minIdx/(K-1) + 1;
            maxIdx += minIdx%(K-1);
        }

        count += (A.length-1-maxIdx)/(K-1);
        if ((A.length-1-maxIdx)%(K-1) != 0) {
            count++;
        }

        return count;
    }
}