import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		int[][] p = new int[n][2];
		for(int i=0; i<n; i++){
			p[i][0] = sc.nextInt();
			p[i][1] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++){
			if(p[i][0] >= h && p[i][1] >= w){
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}