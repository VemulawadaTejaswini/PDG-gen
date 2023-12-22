import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int a=stdin.nextInt();
		int b=stdin.nextInt();
		int max=-99999999;
		if(a+b>=a-b){
			max=a+b;
		}else{
			max=a-b;
		}
		
		if(a*b>=max){
			max=a*b;
		}
		System.out.println(max);
		

	}

}