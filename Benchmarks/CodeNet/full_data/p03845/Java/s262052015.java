import java.util.Arrays;
import java.util.Scanner;

public class Main{

	static final Scanner	s	=new Scanner(System.in);

	public static void main(String args[]){
		input();
		solve();
	}

	private static void input(){
	}

	private static void solve(){
		int n=s.nextInt(),t[]=new int[n],m,p,x,sum;
		for(int i=0;i<n;i++)
			t[i]=s.nextInt();
		sum=Arrays.stream(t).sum();
		m=s.nextInt();
		for(int i=0;i<m;i++) {
			System.out.println(sum-t[s.nextInt()-1]+s.nextInt());
		}
	}
}
