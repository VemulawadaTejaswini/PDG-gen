import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > 9 ){
			System.out.print(-1);
		}
		else if(b > 9){
			System.out.print(-1);
		}else
		    System.out.print(a*b);
		

	}

}