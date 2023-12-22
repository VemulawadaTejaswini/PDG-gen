import java.util.Scanner;

class Main{

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

		if(Math.abs(a-c) <= d){
			System.out.println("Yes");
		}else{
			if(Math.abs(a-b) <= d && Math.abs(b-c) <= d ){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}

		}

	}





}




