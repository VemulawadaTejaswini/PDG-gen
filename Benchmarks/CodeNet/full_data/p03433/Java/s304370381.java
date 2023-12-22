import java.util.Scanner;

class Main{

	public static void main(String[] args) {




		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		int x = N % 500;
		boolean flag = false;
		if(x > K){
			System.out.println("No");
		}else{
			System.out.println("Yes");

		}
		
	}


}
