import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int ans=0;
		
		if(x<y && x*y<0){
			if(-x>y){
				ans=y-x;
			}else{
				ans=1+y+x;
			}
		}else if(x<y && x*y>=0){
			ans=y-x;
		}else if(x>y && x*y<=0){
			if(-y<x){
				ans=1+x+y;
			}else{
				ans=-y-x+1;
			}
		}else if(x>y && x*y>0){
			ans=Math.min(1+(x-y)+1,-y-x+1);
		}
		System.out.println(ans);
	}
}