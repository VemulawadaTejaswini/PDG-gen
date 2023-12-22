import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A;
		int B;
		A = sc.nextInt();
		B = sc.nextInt();
		if(A <= B){
			System.out.println(0);
		}
		else if(A <= 2 * B){
			System.out.println(0);
		}
		else{
			System.out.println(A - 2 * B);
		}
	}
}

