import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int H = Integer.parseInt(scan.next());
		int A = Integer.parseInt(scan.next());
		int num = 0;
		if(H % A == 0) {
			num = H / A;
		} else { 
			num = H / A + 1; 
		}
		System.out.println(num);
	}
}