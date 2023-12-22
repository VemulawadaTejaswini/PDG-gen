import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] d = new int[n];
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			d[i] = a-i-1;
		}
		
		Arrays.sort(d);
		int mid = d[n/2];
		
		int ans = 0;
		for(int i=0;i<n;i++){
			ans+=Math.abs(d[i]-mid);
		}

		System.out.println(ans);
	}

}
