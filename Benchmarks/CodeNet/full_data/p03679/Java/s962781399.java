import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		if(b >= a+x+1) {
			System.out.println("dangerous");
		}else {
			if(b > a) {
				System.out.println("safe");
			}else {
				System.out.println("delicious");
			}
		}
		
	}

}
