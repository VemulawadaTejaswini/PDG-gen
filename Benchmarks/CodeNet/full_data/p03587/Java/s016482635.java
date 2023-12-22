import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve() {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='1') {
				count++;
			}
		}
		System.out.print(count);
	}
}
