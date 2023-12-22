import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		int rcnt = 0, bcnt = 0;
		int n = sc.nextInt();
		String s = sc.next();
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == 'R') rcnt++;
			else bcnt++;
		}
		if(rcnt > bcnt)System.out.println("Yes");
		else System.out.println("No");
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
