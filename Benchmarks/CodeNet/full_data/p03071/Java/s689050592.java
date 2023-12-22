import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int sum =0;
		for ( int i=0;i<2;i++){
			if(A>B){
				sum+=A;
				A=A-1;
			}else{
				sum+=B;
				B=B-1;
			}
		}
		System.out.println(sum);

	}
}

