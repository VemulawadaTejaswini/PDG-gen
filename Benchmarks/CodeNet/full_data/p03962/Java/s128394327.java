import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if((a==b && a!=c)||(a==c && a!=b)||(b==c && a!=c)){
			System.out.println("2");
		}else if (a==b && b==c) {
			System.out.println("1");
		}else {
			System.out.println("3");
		}
	}
}
