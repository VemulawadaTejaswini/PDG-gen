
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[4];
		for(int i=0; i < 4;i++) {
			s[i] = n % 10;
			n /= 10;
		}

		String msg = "Good";
		for(int i = 0; i < 3; i++)
			if(s[i] == s[i+1])
				msg = "Bad";


		System.out.println(msg);
	}

}
