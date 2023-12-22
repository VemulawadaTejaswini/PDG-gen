import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		long a = stdIn.nextLong();
		long b = stdIn.nextLong();
		long c = stdIn.nextLong();
		
		
		
		
		if(Math.sqrt(a)+Math.sqrt(b)< Math.sqrt(c)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}



	}

}
