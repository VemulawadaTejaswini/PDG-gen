import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] ncards = new String[n];
		for(int i=0; i<n; i++) ncards[i]=sc.next();

		int m = sc.nextInt();
		String[] mcards = new String[m];
		for(int i=0; i<m; i++) mcards[i]=sc.next();

		int count=0,ans=0;
		for(int i=0; i<n; i++) {
			String s = ncards[i];

			for (String string : ncards) {
				if(s.equals(string)) count++;
			}

			for (String string2 : mcards) {
				if(s.equals(string2)) count--;
			}
			if(ans < count) ans = count;
			count = 0;
		}
		System.out.println(ans);
	}
}
