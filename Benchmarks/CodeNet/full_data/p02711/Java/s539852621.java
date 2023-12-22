import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int ans = 0;
		int ans1 = 0;
		int ans2 = 0;
		int ans3 = 0;
		ans1 = N % 10;
		ans2 = N % 100;
		ans2 = ans2 / 10;
		ans3 = N / 100;
		if(ans3 == 7 || ans2 == 7 || ans1 == 7){
			ans = 1;
		}
		if(ans == 1){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		stdIn.close();
	}
}