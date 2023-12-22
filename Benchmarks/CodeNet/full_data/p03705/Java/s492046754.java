import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		long min = ((long)N-1) * (long)A + (long)B;
		long max = (long)A + ((long)N-1) * (long)B;

		if(A!=B && N==1){
			System.out.print(0);
		}else if(A>B){
			System.out.print(0);
		}else if(A<=B){
			System.out.print(max-min+1);
		}

	}

}