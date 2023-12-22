import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		long N = scan.nextInt();
		
		long A[] = new long [(int) N];
		
		for(int i = 0;i<N;i++){
			A[i] = scan.nextInt();
		}
		
		TreeMap<Long, Long> intarray = new TreeMap<Long, Long>();
		for (int i = 0; i < N; i++) {
			if (!(intarray.containsKey(A[i]))) {
				intarray.put(A[i], (long) 1);
			} else if(intarray.get(A[i])== 0){
				intarray.put(A[i], (long) 1);
			} else{
				intarray.put(A[i],(long) 0);
			}
		}
		
		long ans = 0;
		
		//System.out.print(intarray.get(18));
		
		for(int i = 0; i<N;i++){
			if (intarray.containsKey(A[i])) {
				if(intarray.get(A[i]) >= 1){
					ans++;
				}
			}
		}
		
		System.out.println(ans);
	
		
	}
	
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];
		return max;
	}
}