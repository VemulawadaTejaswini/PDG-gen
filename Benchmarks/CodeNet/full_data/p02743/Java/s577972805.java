import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		if(Math.sqrt(a)+Math.sqrt(b)<Math.sqrt(c))
			System.out.print("Yes");
		else
			System.out.print("No");
		}
}