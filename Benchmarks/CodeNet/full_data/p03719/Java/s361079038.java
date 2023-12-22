import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	int a,b,c;
	void solve(){
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(c>=a && c<=b)System.out.println("Yes");
		else System.out.println("No");
	}
}
