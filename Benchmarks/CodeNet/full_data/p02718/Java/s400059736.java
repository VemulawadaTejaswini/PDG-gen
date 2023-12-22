import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = s.nextInt();
		}
		
		int sum=0;
		
		for(int i=0; i<n; i++) {
			sum += a[i];
		}
		
		int t = sum / (4*m);
		int count =0;
		for(int i=0; i<n && m>0; i++) {
			if(a[i] > t) {
				m--;		
			}
		}
		
		if(m==0)
			System.out.print("YES");
		else
			System.out.print("NO");
	}

}