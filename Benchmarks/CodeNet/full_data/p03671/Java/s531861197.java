import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int min=Integer.MAX_VALUE;
		min=Math.min(a+b, b+c);
		min=Math.min(min, c+a);
		System.out.println(min);
		
	}

}
