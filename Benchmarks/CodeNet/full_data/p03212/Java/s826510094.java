import java.util.Scanner;
public class Main{
	static long ans;
	static long n;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n=sc.nextLong();
		dfs(0,false,false,false);
		System.out.println(ans);
	}
	static void dfs(long num,boolean c3,boolean c5,boolean c7){
		if(num>n){
			return;
		}
		if(c3 && c5 && c7 && num<=n){
			ans++;
		}
		
		dfs(num*10+3,true,c5,c7);
		dfs(num*10+5,c3,true,c7);
		dfs(num*10+7,c3,c5,true);
	}
}
