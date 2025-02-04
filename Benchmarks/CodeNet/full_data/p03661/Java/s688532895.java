import java.util.*;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];

		long sum = 0;
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
			sum += (long)a[i];
		}
		sum -= (long)2 * a[n - 1];
		
		long min = sum;

		for(int i=n-2; i>=1; i--){
			sum -= (long)2 * a[i];
			if(Math.abs(sum) < Math.abs(min)){
				min = sum;
			}
		}

		System.out.println(Math.abs(min));
	}
}
