import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int K = sc.nextInt();
    	int[] ary_N = new int[N];
    	byte[] ary_K = new byte[K];
    	int max = 0;
    	for(int i = 0; i < N; i++){
    		ary_N[i] = sc.nextInt();
    	}
    	Arrays.sort(ary_N);
    	for(int i = 0; i < K; i++){
    		int sum = 0;
    		sum += ary_N[i];
    		for(int j = i+1; j < N; j++){
    			 sum += ary_N[j];
    		}
    		ary_K[i] = (byte)sum;
    	}
    	max = ary_K[0];
    	for(int i = 1; i < K; i++){
    		max = max & ary_K[i];
    	}
    	System.out.println(max);
    }
}