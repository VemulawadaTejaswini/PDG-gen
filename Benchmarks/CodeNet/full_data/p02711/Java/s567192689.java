import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int ans = 0;
		ans = N % 100;
		ans = N % 10;
		if(ans == 7){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		stdIn.close();
	}
}