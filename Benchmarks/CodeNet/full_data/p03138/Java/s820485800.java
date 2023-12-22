import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		
		long[] X = new long[N];
        for (int i = 0; i < N; i++) {
            X[i] = sc.nextLong();
        }
        
        long max = -1;
        for (long i = 0; i <= K; i++) {
            long sum = 0;
            for (int j = 0; j < N; j++) {
                sum += i ^ X[j];
            }
            if (max < sum) {
                max = sum;
            }
        }
        System.out.println(max);
	}
}