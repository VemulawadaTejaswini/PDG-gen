import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		sA();
	}

	void sA() {
		String S = sc.next();
		String ss[] = S.split("/");
		int date = Integer.parseInt(ss[0]) * 10000 + 
				Integer.parseInt(ss[1]) * 100 +
				Integer.parseInt(ss[2]);
		if(date > 20190430) {
			System.out.println("TBD");
		}
		else System.out.println("Heisei");
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
