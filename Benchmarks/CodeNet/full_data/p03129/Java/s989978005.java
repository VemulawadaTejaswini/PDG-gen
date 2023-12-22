import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		
		int n = sn.nextInt();
		int k = sn.nextInt();
		int cnt = 0,cur = 1;
		while(cur <= n )
		{
			++cur;
			++cnt;
		}
		if( cnt >= k )
			System.out.println("YES");
		else
			System.out.println("NO");
		sn.close();
	}
}
