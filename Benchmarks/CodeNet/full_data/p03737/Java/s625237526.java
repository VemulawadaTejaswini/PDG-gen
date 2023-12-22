import java.util.Scanner;

class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();

		if( a > b ){
			System.out.print("GREATER");
		}else if( a == b ){
			System.out.print("EQUAL");
		}else if( a < b ){
			System.out.print("LESS");
		}

		sc.close();
	}
}