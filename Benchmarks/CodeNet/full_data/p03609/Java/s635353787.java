
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
	Scanner sc	= new Scanner(System.in);
	int x = sc.nextInt();
	int t = sc.nextInt();
	
	if (x < t) {
		System.out.println(0);
	} else {
		System.out.println(x - t);
	}
	}
}
