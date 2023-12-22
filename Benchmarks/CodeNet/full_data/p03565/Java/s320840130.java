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
		char c = T.charAt(0);
		int indexT = S.indexOf(c);
		int tlen = T.length();
		int rlen = tlen + indexT;
		boolean restorable = false;
		String key = "";

		if(indexT > 0){
			for(int i = 1; i <= tlen - 1; i++){
				if((S.charAt(indexT + i) == T.charAt(i)) || (S.charAt(indexT + i) == '?')){
					restorable = true;
				}
				else{
					restorable = false;
					break;
				}
			}
			if(restorable == true) {
				sb.replace(indexT, rlen, T);
				key = sb.toString().replaceAll("\\?", "a");

			}
			else {
				key = "UNRESTORABLE";
			}

		}
		else{
			key = "UNRESTORABLE";
		}
		System.out.println(key);
	}
}
