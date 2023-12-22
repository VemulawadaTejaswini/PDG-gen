//import java.util.Scanner;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String line = br.readLine();
		Scanner scan = new Scanner(System.in);

		int X = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		X = X-A;
		X=X%B;
		System.out.println(X);
		
	}}