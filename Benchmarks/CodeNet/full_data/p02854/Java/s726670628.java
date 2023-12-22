import java.util.*;
public class Main{

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
		int ki = 0;
		for (int i = 0; i < n; i++) {
			k += a[i];
			if(k == sum/2)  {
				ki = 0;
				break;
			} else if (k > sum/2){
				if(k-(sum-k) < sum-2*(k-a[i])) {
					ki = 2 * k - sum;
				} else {
					ki = sum-2*(k-a[i]);
				}
				 break;
			}
		}
		
		
		
		System.out.println(ki);
		
	
		
		
		
	}
}
