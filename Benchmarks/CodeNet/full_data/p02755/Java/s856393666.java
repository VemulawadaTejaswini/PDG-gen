import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		double c = a/0.08;
		double d = b/0.1;
		
		int cc = (int)c;
		int dd = (int)d;

		double ccc = cc*0.1;
		int cccc = (int)ccc;
		
		if(cccc== b) {
			System.out.println(cc);
		}else {
			System.out.println("-1");
		}
		


	}

}
