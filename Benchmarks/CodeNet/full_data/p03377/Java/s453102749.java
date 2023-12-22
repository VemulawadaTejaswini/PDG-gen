import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int X=sc.nextInt();
		if(0<X-A&&X-A<=B) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}