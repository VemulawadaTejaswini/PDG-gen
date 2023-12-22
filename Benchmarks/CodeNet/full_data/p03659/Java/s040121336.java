import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		
		int sum =0;
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		sc.close();
		
		int subsum = 0;
		int smallest =0;
		
		for(int i=0; i<a.length-1; i++) {
			subsum += a[i];
			
			if(i==0) {
				smallest = Math.abs(sum - 2*subsum);
			}else {
				smallest = Math.min(smallest, Math.abs(sum - 2*subsum));
			}
			
		}
		
		System.out.println(smallest);
		
		

	}
	
}
