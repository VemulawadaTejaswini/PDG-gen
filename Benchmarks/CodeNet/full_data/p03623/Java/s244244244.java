import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int a2 = Math.abs(x-a);
		int b2 = Math.abs(x-b);

		if(a2<b2){
			System.out.println("A");
		} else {
			System.out.println("B");
		}
		
		
		
		
	}

}
