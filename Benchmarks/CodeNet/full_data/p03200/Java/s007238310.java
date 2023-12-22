import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		s = sc.next();
		
		sc.close();
		
		int n = s.length();
		int count = 0;
		long ans = 0;
		int p[];
		p = new int[n];
		
		System.out.println(n);
		
		for(int i = n - 1; i >= 0; --i) {
			if(s.charAt(i) == 'B') 
				p[count++] = i + 1;
		}
		
		if(count < n && count > 0) {
			for(int i = 0; i < n; ++i) {
				if(p[i] == 0)break;
				ans += n - p[i] - i;
				System.out.println(i);
			}
		}
		
		
		System.out.println(ans);
	}

}
