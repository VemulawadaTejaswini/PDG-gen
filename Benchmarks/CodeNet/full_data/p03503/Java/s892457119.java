import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] f = new int[n][10];
		int[][] p = new int[n][11];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<10;j++){
				f[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<11;j++){
				p[i][j] = sc.nextInt();
			}
		}
		
		int ans = 0, min = Integer.MAX_VALUE;
		boolean open = false;
		for(int i=0;i<n;i++){
			int c = 0;
			for(int j=0;j<10;j++){
				if(f[i][j]==1)
					c++;
			}
			
			int max = 0, idx = 0;
			for(int j=c;j>=0;j--){
				if(p[i][j]>max){
					max = p[i][j];
					idx = j;
				}
			}
			
			ans+=max;
			
			if(idx!=0){
				open = true;
			}
			
			if(!open){
				Arrays.sort(p[i], 0, c+1);
				if(max-p[i][c-1]<min)
					min = max-p[i][c-1];
			}
		}
		
		System.out.println(open ? ans : ans-min);
	}

}
