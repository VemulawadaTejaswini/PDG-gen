import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = 0;
		if((a+b)%2==0){
			c = (a+b)/2;
		}else{
			c = ((a+b)/2)+1;
		}
		System.out.println(c);
	}
}
