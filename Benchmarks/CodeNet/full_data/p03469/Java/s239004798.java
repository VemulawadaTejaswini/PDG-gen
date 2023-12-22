
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String line = br.readLine();
		Scanner scan = new Scanner(System.in);

	    String a = scan.next();
	    String[] b = a.split("");
	    b[3]="8";
	    
	    for(int i=0;i<b.length;i++)
	        System.out.print(b[i]);
	    System.out.println("");


	}
}
