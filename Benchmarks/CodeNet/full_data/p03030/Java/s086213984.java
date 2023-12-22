import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		int n = sc.nextInt();
		String[] s = new String[n];
		
		for(int i =0 ;i < n ;i ++) {
			s[i] = sc.next() +"_"+ (1100-sc.nextInt())+"_"+(i+1);
		}
		
		Arrays.sort(s);
		
		for(int i =0;i < n ; i++) {
			String[] e = s[i].split("_");
			System.out.println(e[2]);
		}
		
		
	}
}
