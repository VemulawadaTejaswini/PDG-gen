import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		if(b * 2 > a){
			c = 0;
		}
		else{
			c = a - b * 2;
		}
		System.out.print(c);
	}

}