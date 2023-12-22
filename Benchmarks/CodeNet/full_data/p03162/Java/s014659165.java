import java.util.Scanner;
public class Main{
	static int[][] s;
	static int n;
	static int max=0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		 s = new int[n][3];
		for(int i = 0; i<n; i++){
			s[i][0]=sc.nextInt();
			s[i][1]=sc.nextInt();
			s[i][2]=sc.nextInt();
		}
		System.out.println(dfs(0,3,0));
	}
	public static int dfs(int happy,int select,int deep){
		if(deep==n){
			return happy;
		}
		for(int i = 0; i<3; i++){
			if(i!=select){
				max=Math.max(dfs(happy+s[deep][i],i,deep+1),max);
			}
		}
		return max;
	}
}