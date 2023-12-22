
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N  =scn.nextInt();
		scn.nextLine();
		SearchArgo.S = scn.nextLine();

		System.out.println(SearchArgo.searchAns(N));

	}

}

class SearchArgo {
	static String S;
	public static boolean solve(int n) {//必要な引数を入れる
		for(int i = 0;i < S.length()-2*n+1;i++) {
			String s = S.substring(i, i+n);
			String ss = S.substring(i+n);
			if(ss.indexOf(s)>-1)return true;
		}
		return false;
	}
	public static int searchAns(int N) {//必要な引数を入れる
		int l = 0, r = N/2+1;
		while(r-l > 1) {
			int mid = (r+l)/2;
			if(solve(mid)) {//必要な引数を入れる
				l = mid;
			}else {
				r = mid;
			}
		}
		return l;
	}
}