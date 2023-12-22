import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		String ans = "NO";
		if( a%2 == b%2 && b%2 == c%2){
			ans = "YES";
		}
	
		//出力
		System.out.println(ans);

	}

}