import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int a = sc.nextInt();
		int b = sc.nextInt();

		if(a<b){
			if (a==1) {
				System.out.println("Alice");
			}else {
				System.out.println("Bob");
			}
		}else if (a>b){
			if (b==1) {
				System.out.println("Bob");
			} else {
				System.out.println("Alice");
			}
		}else {
			System.out.println("Draw");
		}

	}
}
