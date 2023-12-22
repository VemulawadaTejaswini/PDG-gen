import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		System.out.println(calcKoubaisuu(A, B));
	}

	public static int calcKoubaisuu(int A, int B){
		for(int i = 1;; i++){
			for(int j = 1;B * j <= A * i; j++){
				if(A * i == B * j)return A * i;
			}
		}
	}
}
