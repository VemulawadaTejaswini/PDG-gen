import java.util.Scanner;

public class Main{

	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int answer = a - b * 2;
		
		if(answer < 0) {
			System.out.println(0);
		} else {
			System.out.println(answer);
		}
		
	}
}