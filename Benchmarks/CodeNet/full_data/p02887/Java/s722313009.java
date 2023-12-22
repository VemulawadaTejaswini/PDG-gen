import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static int[] takos=new int[101];
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		String S=sc.nextLine();
		int ans=1;
		char start=S.charAt(0);
		for(int i=1;i<S.length();i++) {
			if(start!=S.charAt(i)) {
				start=S.charAt(i);
				ans++;
			}
		}
		System.out.println(ans);
	}

}
