import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		
		char count[] = new char[256];
		for(char ch:s) {
			count[ch]++;
		}
		
		if(count['R'] > count['B']) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}
