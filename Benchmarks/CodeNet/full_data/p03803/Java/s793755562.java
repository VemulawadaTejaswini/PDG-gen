import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A == 1){
			A += 13;
		}
		if(B == 13){
			B += 13;
		}
		if(A == B){
			System.out.print("Draw");
		}else if (A > B){
			System.out.print("Alice");
		}else{
			System.out.print("Bob");
		}
	}
}