import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        int key = 10;
        for (int i=0;i<N-1;i++) {
            // int[] arr = new int[N-1-i];
            // for (int j=i+1;j<N;j++) {
            //     arr[j-(i+1)] = A[j];
            // }
            int left = i;
            int right = N;
            while (right-left>1) {
                int mid = (right+left)/2;
                if (A[mid]*A[i]>key) {
                    right = mid;
                } else {
                    left = mid;
                }
            }
            System.out.println("right: "+right);
            System.out.println("right_cnt: "+(right-(i+1)));
        }
    }
}