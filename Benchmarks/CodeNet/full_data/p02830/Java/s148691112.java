import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		char[] S = sc.next().toCharArray();
		char[] T = sc.next().toCharArray();
		sc.close();
		String rs = String.valueOf(S);
		int num = rs.length();

		for(int i=0; i<num; i++) {
			System.out.print(S[i]);
			System.out.print(T[i]);
		}
	}
}
