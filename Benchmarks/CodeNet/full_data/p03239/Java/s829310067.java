import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int n = sc.nextInt();
		int t = sc.nextInt();
		int min = 1001;
		for(int i = 0; i < n; i++) {
			int c = sc.nextInt();
			if(sc.nextInt() <= t) {
				if(min > c) min = c;
			}
		}
		if(min <= 1000)System.out.println(min);
		else System.out.println("TLE");
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}
