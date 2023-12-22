import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		if(x==3 || x==5 || x==7) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
