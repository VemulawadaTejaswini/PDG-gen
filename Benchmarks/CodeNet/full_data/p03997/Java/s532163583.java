import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int h = scan.nextInt();
		int area = (a + b) * h / 2;
		
		System.out.println(area);

	}

}