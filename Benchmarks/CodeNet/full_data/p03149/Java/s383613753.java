import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	void doIt() {
		int[] c = new int[10];
		Arrays.fill(c, 0);
		for(int i = 0; i < 4; i++) {
			c[sc.nextInt()]++;
		}
		if(c[1] == 1 && c[9] == 1 && c[7] == 1 && c[4] == 1) {
			System.out.println("YES");
		}
		else System.out.println("NO");
	}
	

	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
