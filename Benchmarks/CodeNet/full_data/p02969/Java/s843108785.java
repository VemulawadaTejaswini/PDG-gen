import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 double r = scan.nextInt();
		 
		 System.out.println((int)(3 * Math.pow(r, 2)));
		 
		 scan.close();
	}

}
