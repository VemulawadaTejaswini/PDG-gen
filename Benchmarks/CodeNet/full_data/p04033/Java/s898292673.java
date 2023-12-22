import java.io.InputStreamReader;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(new InputStreamReader(System.in))){
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			if(a > 0){
				System.out.println("Positive");
			}else if(b >= 0){
				System.out.println("Zero");
			}else{
				int x = b - (a - 1);
				if(x % 2 == 0){
					System.out.println("Positive");
				}else{
					System.out.println("Negative");
				}
			}
		}
	}
}
