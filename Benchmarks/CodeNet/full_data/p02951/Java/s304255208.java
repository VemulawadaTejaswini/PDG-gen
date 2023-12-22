import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ab=scan.nextInt()-scan.nextInt();
		int c =scan.nextInt()-ab;
		if(c<=0){
			c=0;
		}
		System.out.println(c);
	}
}