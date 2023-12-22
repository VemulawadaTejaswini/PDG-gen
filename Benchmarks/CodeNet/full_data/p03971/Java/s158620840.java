import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		String S = in.next();
		
		if (S.length() != N) throw new IllegalArgumentException();
		int AB = A + B;
		
		for(int i=0; i<N; i++) {
			char c = S.charAt(i);
			
			if (c == 'a' && AB > 0) {
				System.out.println("Yes");
				AB--;
			} else if (c == 'b' && AB > 0 && B>0) {
				System.out.println("Yes");
				AB--; B--;
			} else {
				System.out.println("No");
			}
		}

	}

}
