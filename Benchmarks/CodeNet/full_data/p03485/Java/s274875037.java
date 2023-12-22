
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String line = br.readLine();
		Scanner scan = new Scanner(System.in);

	    double a = scan.nextDouble();
	    double b = scan.nextDouble();
	    double c = (a+b)/2;
	    c = Math.ceil(c);

	    System.out.println(c);


	}
}
