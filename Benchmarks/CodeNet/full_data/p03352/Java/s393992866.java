
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x=sc.nextDouble();
		for(;x>0;x--) {
			if(Math.sqrt(x) % 1 ==0) {
				System.out.println((int)x);
				return;
			}
		}
	}
}
