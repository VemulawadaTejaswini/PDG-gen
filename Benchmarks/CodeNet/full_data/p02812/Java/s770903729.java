import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		char[] chrs = s.toCharArray();
		int count=0;
		for(int i=2; i<N; i++)
		{
			if(chrs[i]=='C' && chrs[i-1]=='B'&& chrs[i-2]=='A' )
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
