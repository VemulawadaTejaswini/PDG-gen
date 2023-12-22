import java.util.*;

class Main{
    int N;
    long[] A;

    public Main(){
        long K;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = scanner.nextLong();

        A = new long[N];
        for(int i=0;i<N;i++){
            A[i] = scanner.nextLong();
        }

        Arrays.sort(A);

        long L = -1000000000000000001L,
             R =  1000000000000000001L;
        while(R-L>1){
            long mid = L + (R-L)/2;

            if(K <= totalNum(mid))
                R = mid;
            else
                L = mid;
        }

        System.out.println(R);
    }

    long totalNum(long val){
        long result = 0;
        //A[i]*T <= N となるTの数を集計する
        for(int i=0;i<N;i++){
            //A[i]が0ならば掛け算は必ず0となる
            if(A[i] == 0){
                if(val >= 0) result += N-i-1;
                continue;
            }

            int L = i, R = N;
            if(A[i] > 0) {
                while(R-L > 1){
                    int mid = L + (R-L)/2;
                    if(val < A[i]*A[mid])
                        R = mid;
                    else
                        L = mid;
                }
                result += L-i;
            } else{
                while(R-L>1){
                    int mid = L + (R-L)/2;
                    if(val >= A[i]*A[mid])
                        R = mid;
                    else
                        L = mid;
                }
                result += N-R;
            }
        }

        return result;
    }

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }
}
