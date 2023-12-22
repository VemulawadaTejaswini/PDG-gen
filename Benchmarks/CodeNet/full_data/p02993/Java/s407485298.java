import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String codes = sc.next();
		sc.close();
		boolean bl = false;
		for(int i=0; i<3; i++) {
			bl = codes.charAt(i) == codes.charAt(i+1);
		}
		if(bl) {
			System.out.println("Bad");
		}else {
			System.out.println("Good");
		}
	}
}