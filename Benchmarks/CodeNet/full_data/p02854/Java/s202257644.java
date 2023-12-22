import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int[] a = new int[n];
		
		long sum = 0;
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
			sum += a[i];
		}
		
		long sum2 = 0;
		int index = 0;
		for(int i = 0; i < n; i++) {
			sum2 += a[i];
			if(sum2*2 > sum) {
				index = i;
				break;
			}
		}
		
		long sum3 = 0;
		long ans = 0;
		for(int i = 0; i < index; i++) {
			sum3 += a[i];
		}
		if(sum3 < sum - sum3 - a[index]) {
			ans = sum3+a[index] - (sum-sum3-a[index]);
		}else {
			ans = (sum - sum3) - sum3;
		}

		System.out.println(ans);

		
		
		
		
		
		
		
		
	}

}
