
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), l = in.nextInt();

		int s = 0;
		for(int i = 1; i <= n; i++)
			s+= i + l - 1;


		if(l <= 0) {
			if(-1*l <= n+1)
				s-= -1 * l - 1;
			else
				s-= n + l - 1;
		}else
			s -= l;

		System.out.println(s);
	}

}