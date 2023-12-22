import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);

		long n=sc.nextLong();		//N個のボール
		long a=sc.nextLong();		//青いボール
		long b=sc.nextLong();		//赤いボール

		long sum=n / (a+b)*a;
		long result=n % (a+b);

		if(result>=a) {
			sum+=a;
		}else {
			sum+=result;
		}
		System.out.println(sum);
		sc.close();
	}
}
