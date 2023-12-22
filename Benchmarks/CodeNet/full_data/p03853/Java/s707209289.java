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
		int h=s.nextInt();
		s.next();
		for(int i=0;i<h;i++) {
			String in=s.next();
			System.out.println(in);
			System.out.println(in);
		}
	}
}
