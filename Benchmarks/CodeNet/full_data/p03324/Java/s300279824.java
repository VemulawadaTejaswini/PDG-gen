import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int d = scan.nextInt();
		int n = scan.nextInt();

		int num = (int)Math.pow(100.0, d) * n;

		System.out.println(num);
	}
}
