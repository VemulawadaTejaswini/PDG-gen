import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	int A,B;
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		A=sc.nextInt();
		String s=sc.next();
		B=sc.nextInt();
		
		if(s.equals("+"))System.out.println(A+B);
		else System.out.println(A-B);
		
	}
}