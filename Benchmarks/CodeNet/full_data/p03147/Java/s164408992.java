import java.util.*;


public class Main {
	
	
	
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h[] = new int[n];
		for(int i=0;i<n;i++)h[i] = sc.nextInt();
		sc.close();
		int t[] = new int[n];
		
		int max = 0;
		for(int i=0;i<n;i++) max = Math.max(h[i], max);
		
		int cnt = 0;
		for(int i=0;i<max;i++) {

			boolean minus = false;
			for(int j=0;j<n;j++) {
				if(t[j]<h[j]) {
					if(!minus) {
						cnt++;
					}
					minus = true;
					t[j]++;
				}
				else {
					minus = false;
				}
			}
			
		}
		System.out.println(cnt);
		
	}
	

}
