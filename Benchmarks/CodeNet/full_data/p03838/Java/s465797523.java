import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int ans=Integer.MAX_VALUE;
		int[]a=new int[4];
	
		a[0]=1+(-y+x)+1;
		a[1]=1+(y+x);
		a[2]=(-y-x)+1;
		a[3]=y-x;
		
		for(int i=0;i<4;i++){
			if(a[i]>0)
			ans=Math.min(ans, a[i]);
		}
		System.out.println(ans);
	}
}
