import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  
  	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		Long[] array = new Long[N * (N-1) / 2];
		long[] A = new long[N];

		for(int i=0;i<N;i++){
			A[i] = sc.nextLong();
		}

		int sum = 0;

		for(int i=0;i< N;i++){
			long a = A[i];
			for(int j=i+1;j<N;j++){
				array[sum] = a * A[j];
				sum++;
			}
		}
		
		System.out.println(sum -1);
		System.out.println(N * (N-1) / 2);

		List<Long> list = Arrays.asList(array);

		Collections.sort(list);

		System.out.println(list.get(K-1));
		
		

	}

}