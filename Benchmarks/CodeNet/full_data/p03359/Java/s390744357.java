import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result = a - 1 ;
		if(b >= a) {
			result ++;
		}
		
		System.out.println(result);
	}
}
