import java.util.*;
public class Main{
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[] start = new boolean[n+1];
		boolean[] end = new boolean[n+1];
		for(int i=0;i<n;i++){
			start[i]=false;
			end[i]=false;
		}
		int keep1;
		int keep2;
		boolean result = false;
		for(int i=0;i<m;i++){
			keep1 = sc.nextInt();
			keep2 = sc.nextInt();
			if(keep1==1){
				start[keep2-1]=true;
			}
			else if(keep2==n){
				end[keep1-1]=true;
			}
		}
		for(int i=0;i<=n;i++){
			if(start[i]&&end[i]){
				System.out.println("POSSIBLE");
				return;
			}
		}
		System.out.println("IMPOSSIBLE");
	}
}
