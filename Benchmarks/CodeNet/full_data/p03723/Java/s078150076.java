import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int A_pre = A;
		int B_pre = B;
		int C_pre = C;

		int count = 0;
		
		while(A%2==0 && B%2==0 && C%2==0){
			A = B_pre/2 + C_pre/2;
			B = A_pre/2 + C_pre/2;
			C = A_pre/2 + B_pre/2;
			if(A==A_pre && B==B_pre && C==C_pre){
				count=-1;
				break;
			}
			A_pre = A;
			B_pre = B;
			C_pre = C;
			count++;
		}
		
		System.out.println(count);
	}

}
