import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		char s[] = sc.next().toCharArray();
		int ans = 0;
		ArrayDeque<Character> st = new ArrayDeque<Character>();
		st.push(s[0]);
		for(int i=1; i<s.length; i++) {
			if(st.isEmpty() || s[i] == st.getFirst()) {
				st.push(s[i]);
			}else {
				st.pop();
				ans++;
			}
		}
		System.out.println(ans*2);
		sc.close();
	}

}
