import java.io.IOException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;
	
	public static void main(String[] args)throws IOException {
		
		sc = new Scanner(System.in);
		String aa = sc.next();
		int a = Integer.parseInt(aa);
		String bb = sc.next();
		int b = Integer.parseInt(bb);
		String cc = sc.next();
		int c = Integer.parseInt(cc);
		if((a==b && a==c)){
			System.out.println("1");
		}
		else if(a==b || b==c ||a==c){
			System.out.println("2");
		}
		else{
			System.out.println("3");
		}
		
	}
}
