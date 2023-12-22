import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		String a = "Yes";
		for(int i=0; i<S.length(); i+=2) {
			if(S.charAt(i)=='L'){
				a = "No";
			}
		}
		for(int i=1; i<S.length(); i+=2) {
			if(S.charAt(i)=='R'){
				a = "No";
			}
		}
		System.out.println(a);

	}

}