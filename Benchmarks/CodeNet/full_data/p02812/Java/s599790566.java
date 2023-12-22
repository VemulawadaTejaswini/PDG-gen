
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int cnt=0;
		for(int i=0; i<n-3+1; i++) {
			if(s.substring(i,i+3).equals("ABC")) {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
