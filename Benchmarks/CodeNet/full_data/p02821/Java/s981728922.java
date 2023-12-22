import java.util.Arrays;
import java.util.Scanner;

public class Main{
    static int binarySearch(long Y , long A[]){
        int N = A.length;
        if(A[N - 1] < Y){
            return N;
        }
        if(A[0] >= Y){
            return 0;
        }
        int low = 0; // false
        int high = N - 1; // true
        while(low < high - 1){
            int mid = (low + high) / 2;
            if(A[mid] >= Y){
                high = mid;
            }else{
                low =  mid;
            }
        }
        return high;
    }
    // 幸福度X以上の握手の数
    static long numberOfHandshake(long X , long A[] ){
        int N = A.length;
        long ret = 0;
        for(int i = 0 ; i < N ; ++i){
            ret += N - binarySearch(X - A[i], A);
        }
        return ret;
    }
    static long totalHappiness(long X , long A[]){
        int N = A.length;
        long S[] = new long[N + 1];
        for(int i = 0 ; i < N ; ++i){
            S[i + 1] = S[i] + A[i];
        }
        long ret = 0;
        for(int i = 0 ; i < N ; ++i){
            int idx = binarySearch(X - A[i], A);
            ret += S[N] - S[idx] + (N - idx) * A[i];
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = sc.nextLong();
        long A[] = new long[N];
        for(int i = 0 ; i < N ; ++i){
            A[i] = sc.nextLong();
        }
        sc.close();
        Arrays.sort(A);
        long low = 0; // ?
        long high = A[N - 1] * 2 + 1; // true
        while(low < high){
            long mid = (low + high) / 2;
            long c = numberOfHandshake(mid , A);
            if(c <= M){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        long c = numberOfHandshake(low, A);
        long h = totalHappiness(low, A);
        if(c < M){
            h += (low - 1) * (M - c);
        }
        System.out.println(h);
    }
}
