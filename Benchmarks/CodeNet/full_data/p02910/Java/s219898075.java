import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		for(int i = 0; i < s.length; i++) {
			if(i % 2 == 0 && s[i] == 'L') {
				System.out.println("No"); return;
			}
			else if(i % 2 != 0 && s[i] == 'R') {
				System.out.println("No"); return;
			}
		}
		System.out.println("Yes");
	}

}
