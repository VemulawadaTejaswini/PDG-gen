import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		String [] s = new String[n];

		for(int i = 0; i < n; i++) {
			s[i] = stdIn.next();
		}

		Arrays.sort(s);
		int cnt = 1;
		for(int i = 0; i < n-1; i++) {
			if(!s[i].equals(s[i+1])) {
				cnt++;
			}
		}
		if(cnt==3) {
			System.out.println("Three");
		}else {
			System.out.println("Four");
		}

	}

}
