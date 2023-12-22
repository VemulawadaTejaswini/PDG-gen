import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		long a =sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		if(c-a<0) {
			System.out.println((a-c)+" "+b);
			System.exit(0);
		}
		else if(c-a-b==0) {
			System.out.println(0+" "+0);
			System.exit(0);
		}
		
		c=c-a;
		if(c-b>=0) {
			System.out.println(0+" "+0);
			System.exit(0);
		
		}
		else {
			System.out.println(0+" "+(b-c));
		}
	}

}
