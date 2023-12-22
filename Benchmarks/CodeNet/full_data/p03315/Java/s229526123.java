import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;
		String S = sc.next();
		for(int i=0;i<S.length();i++) {
			switch(S.charAt(i)){
				case '+':
					N++;
					break;
				case '-':
					N--;
					break;
				default:
						
			}
		}
		System.out.println(N);
	}
}
