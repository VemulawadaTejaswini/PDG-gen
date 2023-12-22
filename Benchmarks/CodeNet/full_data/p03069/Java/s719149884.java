import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { //For large strings, don't use extra space, 
		//just print in one line as you calculate
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		String x = input.next();
		int START = N;
		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (x.charAt(i)=='#') {
				START=i;
				break;
			}
		}
		for (int i = START+1; i < N; i++) {
			if (x.charAt(i)=='.') ans++;
		}
		System.out.println(ans);
	}	
}