import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int distance = b - (a + w);
		int x = w + a;
		int y = w + b;

		if(x >= b){
			System.out.println("0");
		}else if(a>b){
			System.out.println((a-(b+w)));
		}else {
			System.out.println(distance);
		}
	}
}
