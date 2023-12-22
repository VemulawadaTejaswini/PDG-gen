import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        Integer[] A = new Integer[N];
        Integer[] B = new Integer[N];

        for(int i = 0; i < N; i++){
            A[i] = scan.nextInt();
            B[i] = scan.nextInt();
        }

        Integer[] idx = new Integer[N];
        Arrays.setAll(idx, i -> i);
        Arrays.sort(idx, Comparator.comparingInt(i -> A[i]));

        long count = 0, sum = 0;
        for(int i = 0; i < N; i++){
            count += B[idx[i]];
            sum += (long)A[idx[i]] * B[idx[i]];
            if(count > M){
                sum -= (long)(count - M) * A[idx[i]];
                break;
            }
        }

        System.out.println(sum);
    }
}