import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		scan.close();
		int i=0;
		while(true) {
			if(Math.floor(i*0.08) == a && Math.floor(i*0.1) == b )break;
			if(Math.floor(i*0.08) > a || Math.floor(i*0.1) > b) {
				i=-1;
				break;
			}
			i++;
		}
		System.out.println(i);
	}
}