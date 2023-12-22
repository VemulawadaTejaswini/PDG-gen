import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean S = false;
		boolean W = false;
		boolean N = false;
		boolean E = false;
		String str = sc.next();
		for(char c : str.toCharArray()){
			if(c == 'S') S = true;
			else if(c == 'W') W = true;
			else if(c == 'N') N = true;
			else if(c == 'E') E = true;
		}
		
		if((S && !N) || (!S && N) || (E && !W) || (!E && W)) System.out.println("No");
		else System.out.println("Yes");
	}
}