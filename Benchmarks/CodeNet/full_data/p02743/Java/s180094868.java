import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		if(c-(a+2*Math.sqrt(a*b)+b)>0)
			System.out.print("Yes");
		else
			System.out.print("No");
		}
}
