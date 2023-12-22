import java.util.Scanner;

public class Main {
	static int search(int A , int B){
		for(int x = 1 ; x <= 10000 ; ++x){
			int tax8 =  x * 8 / 100;
			int tax10 = x * 10 / 100;
			if(tax8 == A && tax10 == B){
				return x;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(search(A, B));
	}
}
