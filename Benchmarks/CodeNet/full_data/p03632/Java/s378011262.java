import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if ((b-a)<=(d-c)&&b-a-c>0){
			
			System.out.println(b-a-c);
			
		} else if (b-a-c<0) {

			System.out.println(0);
			
		} else if ((b-a)>(d-c)){
				
				System.out.println(d-c);
				
			

				


		}
	}
}
