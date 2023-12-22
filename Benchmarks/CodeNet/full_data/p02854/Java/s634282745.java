import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		int[] a = new int[n];
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		//System.out.println("sum="+sum);
		
		int k = 0;
		int ki  = 0;
		for (int i = 0; i < n; i++) {
			k += a[i];
			if(k >= sum/2)  {
				ki = i;
				break;
			}
		}
		
		//System.out.println(k+ " " + ki + " " +sum/2);
		
	
		
		
		if(sum/2 == k) {
			System.out.println(0);
		} else {
		System.out.println(sum - k);
		}
	}
}
