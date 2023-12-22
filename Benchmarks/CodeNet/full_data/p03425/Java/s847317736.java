import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] S = new String[N];
		char[] initial = new char[N];
		int m = 0; int a = 0; int r = 0; int c = 0; int h = 0;
		int march = 0;

		for(int i=0; i<N; i++) {
			S[i] = sc.next();
			initial[i] = S[i].charAt(0);
			if(initial[i] == 'M') m++;
			else if(initial[i] == 'A') a++;
			else if(initial[i] == 'R') r++;
			else if(initial[i] == 'C') c++;
			else if(initial[i] == 'H') h++;
		}
			if(m != 0) march += 1; else m+= 1;
			if(a != 0) march += 1; else a+= 1;
			if(r != 0) march += 1; else r+= 1;
			if(c != 0) march += 1; else c+= 1;
			if(h != 0) march += 1; else h+= 1;
			//System.out.println(h); //チェック

			//System.out.println(march); //チェック

			int ans = 0;
			ans += march*(march-1)*(march-2)/6;
			//System.out.println(ans); //チェック
			ans *= m*a*r*c*h;

			System.out.println(ans);
	}

}
