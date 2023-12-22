import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		if(A == 0){
			System.out.println(B);
		}else{
		int x = (int)Math.pow(100.0, (double)A);
		System.out.println(x*B);
		}

	}





}