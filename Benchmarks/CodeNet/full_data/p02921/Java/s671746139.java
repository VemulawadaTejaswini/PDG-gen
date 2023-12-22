import java.util.Scanner;
 
public class Main {
 
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt() - 1;
		int b = sc.nextInt() - 1;
		int total = 0;

		if(b != 1){
			total = (b+a-1)/a;
		}
		System.out.println(total);
	}
}