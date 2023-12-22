import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);

		int target = cin.nextInt();
		long A[] = new long[target];
		int minus_count =0;
		long tmp = 0L;
		long sum_tmp = 0L;
		boolean result[] = new boolean[target];
		for(int i=0;i<target;i++){
			A[i] = cin.nextLong();
		}
		cin.close();

		Arrays.sort(A);

		for(int j=0;j<target-1;j++){
			tmp = A[j]+sum_tmp;
			Arrays.fill(result, false);
			for(int k=j+1;k<target&&2*tmp>=A[k];k++){
				tmp += A[k];
				result[k] = true;
			}
			if(!result[target-1]){
				minus_count++;
			}
			sum_tmp += A[j];
		}

		System.out.println(target-minus_count);

	}
}
