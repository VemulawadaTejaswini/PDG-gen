import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long K = sc.nextLong();
		sc.close();
		
		int otherIdx = 0;
		for(int i = 0;i < S.length();++i)
			if(S.charAt(i) != '1') {
				otherIdx = i;
				break;
			}
		
		if(otherIdx > K)
			System.out.println(1);
		else
			System.out.println(S.charAt(otherIdx));
	}
}
