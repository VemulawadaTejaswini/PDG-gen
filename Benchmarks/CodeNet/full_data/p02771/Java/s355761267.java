import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan =new Scanner(System.in);
		int A=scan.nextInt();
		int B =scan.nextInt();
		int C=scan.nextInt();
		int a=0;
		if(A==B&&B!=C) {
			a=1;
		}
		if(B==C&&C!=A) {
			a=1;
		}
		if(A==C&&C!=B) {
			a=1;
		}
		
		if(a==1) {
			System.out.println("Yes");
		}
		else if(a==0) {
			System.out.println("No");
		}
	}
}