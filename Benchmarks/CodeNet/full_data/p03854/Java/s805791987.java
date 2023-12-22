import java.util.Arrays;
import java.util.Scanner;

class Main {
	String s;
	String[] d = { "dream", "dreamer", "erase", "eraser" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}

	Main(Scanner sc) {
		s = sc.next();
	}

	void solve() {
		boolean[] dp = new boolean[s.length()+1];
		Arrays.fill(dp, false);
		dp[0] = true;
		for(int i=0;i<s.length();i++){
			if(dp[i]){
				for(int j=0;j<4;j++){
					if(i+d[j].length()<=s.length()){
						if(d[j].equals(s.substring(i,i+d[j].length()))){
							dp[i+d[j].length()] = true;
						}
					}
				}
			}
		}
		if(dp[s.length()]){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}