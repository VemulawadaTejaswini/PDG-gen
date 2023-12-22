import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = "";
		int j = 1;
		for(int i = 2; n != 0; i *= 2) {
			if(n % i != 0) {
				n -= j;
				s = "1" + s;
			}
			else 
				s = "0" + s;
			j *= -2;
		}
		if(s.isEmpty()) s = "0";
		System.out.println(s);
	}

}
