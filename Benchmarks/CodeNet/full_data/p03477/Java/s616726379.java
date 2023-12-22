import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		int L = A + B;
		int R = C + D;

		String result;
		if(L > R){
			result = "Left";
		}
		else if(L < R){
			result = "Right";
		}
		else{
			result = "Balanced";
		}

		System.out.println(result);
	}
}