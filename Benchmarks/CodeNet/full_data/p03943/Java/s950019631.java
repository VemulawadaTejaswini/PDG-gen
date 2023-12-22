import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(a == b + c){
			System.out.println("はい");
		}
		else if(b == a + c){
			System.out.println("はい");
		}
		else if(c == a + b){
			System.out.println("はい");
		}
		else{
			System.out.println("いいえ");
		}
		

	}

}
