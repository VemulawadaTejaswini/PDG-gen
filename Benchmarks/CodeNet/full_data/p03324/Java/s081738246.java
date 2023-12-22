import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		if(A == 0){
			if(B == 100){
				System.out.println((B+1));

			}else{
				System.out.println(B);
			}
		}else{
			int x = 1;
			for(int i = 0;i<A;i++){
				x *= 100;
			}
			if(B == 100){
				System.out.println(x*(B+1));

			}else{
				System.out.println(x*B);
			}
		}

	}





}