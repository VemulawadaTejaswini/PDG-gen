import java.util.Scanner;

public class Main{

	String S, T;

	public static void main(String[] args) {
		Main a = new Main();
		a.read();
		a.solve();
	}

	public void read() {
		Scanner sc = new Scanner(System.in);
		S = sc.next();
		T = sc.next();
	}

	public void solve() {
		StringBuilder sb = new StringBuilder();
		sb.append(S);
		int tlen = T.length();
		int slen = S.length();
		boolean restorable = false;
		String key = "";

		outer: for(int i = slen - tlen; i >= 0; i--){
			inner: for(int j = 0; j < tlen; j++){
				if((S.charAt(i + j) != T.charAt(j)) && (S.charAt(i + j) != '?')) {
					continue outer;
				}

			}
		sb.replace(i, i + tlen, T);
		restorable = true;
		break;
		}
		if(restorable == true) {
			key = sb.toString().replaceAll("\\?", "a");
		}
		else {
			key = "UNRESTORABLE";
		}
		System.out.println(key);
	}
}
