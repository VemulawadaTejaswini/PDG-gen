import java.util.Scanner;

class Main{

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();


		if(N < 4){
			System.out.println("No");
		}else{

			boolean flag = check(false,N);
			if(flag){
				System.out.println("Yes");

			}else{
				System.out.println("No");
			}
		}


	}


	static	boolean check(boolean flag,int N){
		if(N == 0){
			return flag = true;
		}

		if(N < 0){
			return flag;
		}

		flag =  check(flag,N-4);
		flag = check(flag, N-7);

		return flag;


	}







}