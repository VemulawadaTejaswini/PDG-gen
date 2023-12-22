import java.util.Scanner;

public class Main{
	static Scanner s = new Scanner(System.in);			//文字の入力

	static int A = s.nextInt();
	static int B = s.nextInt();

		
static int sum =0;

	public static void main(String[] args){
		solve();
	}

	static void solve() {
		int C = A*B;
		if(C%2 == 1){
			System.out.println("Odd");
			
		}else{
			System.out.println("Even");
		}

		


	}





}