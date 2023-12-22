import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d = in.nextInt();
		int n = in.nextInt();
		if(d==0) {
			System.out.println(n);
		}else if(d==1) {
			System.out.println(n*100);
		}else {
			System.out.println(n*10000);
		}

	}

}