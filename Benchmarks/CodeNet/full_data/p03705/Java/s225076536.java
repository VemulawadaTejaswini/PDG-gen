import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		long N = sc.nextLong(), A = sc.nextLong(), B = sc.nextLong();
		if(A > B) System.out.println(0);
		else if(A == B) System.out.println(1);
		else {
			if(N <= 1) System.out.println(0);
			else System.out.println((N - 2) * (B - A) + 1);
		}
	}
}