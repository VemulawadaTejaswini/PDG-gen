import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		long a = stdIn.nextLong();
		long b = stdIn.nextLong();
		long c = stdIn.nextLong();
		
		
		if(a * b * 4 < ((c*c)-(a*c)-(b*c)-(a*c)+(a*a)+(a*b)-(b*c)+(a*b)+(b*b))) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}

}
