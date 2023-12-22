import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int counter = 0;
		int amari = 0;
		for(int i = 0; i < num; i++){
			int A = scan.nextInt();
			if(amari == 1 && A > 0){
				A += 1;
			}
			counter += A / 2;
			amari = A % 2;
		}
		System.out.println(counter);
	}
}