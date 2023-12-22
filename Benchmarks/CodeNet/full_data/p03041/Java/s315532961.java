import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		String  S = sc.next();
		
		String substring = S.substring(K-1, K);
		String lower = substring.toLowerCase();
		String replace = S.replaceFirst(substring,lower);
		
		System.out.println(replace);
		
		sc.close();
		
	}

}