import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		int ans = 1;
		for(int i = 0; i < n; i++){
			h[i] = sc.nextInt();
			if(i != 0){
				if(h[i] >= h[0] && h[i] >= h[1] && h[i] >= h[i-1]){
					ans++;
				}
			}
		}
		System.out.print(ans);
	}
}
