import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args)
	{
		new Main().run();
	}
	
	public void run()
	{
		Scanner file = new Scanner(System.in);
		long K = file.nextLong();
		long A = file.nextLong();
		long B = file.nextLong();
		long opt1 = K+1;
		long L = K-A+1;
		long opt2 = L/2*(B-A)+A+(L%2);
		System.out.println(Math.max(opt1, opt2));
	}
	
}
