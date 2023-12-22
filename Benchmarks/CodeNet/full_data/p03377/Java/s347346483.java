import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int x=sc.nextInt();
		if(0<x-a&&x-a<=b) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}