//A
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int K = sc.nextInt();

		String S = sc.next();

		ArrayList<Integer> a = new ArrayList<>();

		//ArrayList<Integer> b = new ArrayList<>();

		int i = 0;

		int count = 0;

		int maxA = 0;

		while(i<N) {

			int c = 0;

			if(S.charAt(i)=='0') {

				while(S.charAt(i) == '0') {

					c++;

					i++;

					if(i>=N) break;
				}
			}else {

				while(S.charAt(i)=='1') {

					c++;

					i++;

					if(i>=N) break;
				}
			}
			a.add(c);

			count++;
		}
		int ans = 0;

		int ans0;

		//最初をかえる
		if(S.charAt(0)=='0') {

			ans = a.get(0);

			for(int j=1;j<K+2;j++) {

				if(j>=N) break;

				if(j+1<a.size()) ans += a.get(j);
			}
		}

		for(int r=1;r<a.size()-K-2;r++) {

			int l = r+K+2;

			ans0 = 0;

			for(int j=r;j<=l;j++) {

				if(a.get(r)=='0') break;

				ans0 += a.get(j);
			}

			ans = Math.max(ans,ans0);
		}

		if(N==1 && S.charAt(0)=='1') ans = 1;

		if(N==1 && S.charAt(0)=='0') ans = 0;

		System.out.println(ans);
	}

}
