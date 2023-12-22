import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt(),d=scan.nextInt();
		System.out.println(Math.min(a, b)+(Math.min(c, d)));

	}

}
