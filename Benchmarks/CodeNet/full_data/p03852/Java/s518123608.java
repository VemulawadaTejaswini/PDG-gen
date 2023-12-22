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
		char a=s.next().charAt(0),c[]= "aiueo".toCharArray();
		for(char i:c) {
			if(a==i) {
				System.out.println("vowel");
				return;
			}
		}
		System.out.println("consonant");
	}
}
