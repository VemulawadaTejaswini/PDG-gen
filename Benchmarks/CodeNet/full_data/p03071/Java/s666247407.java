import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A; int B; int X;
		A = scan.nextInt();
		B = scan.nextInt();
		X = 0;
		if(A>=B){
		X=X+A;
		A=A-1;
		}else if(A<=B){
			X=X+B;
			B=B-1;
		}
		if(A>=B){
		X=X+A;
		A=A-1;
		}else if(A<=B){
		X=X+B;
		B=B-1;
}
		System.out.println(X);
		scan.close();
	}
}