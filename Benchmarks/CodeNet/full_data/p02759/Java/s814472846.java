import java.util.Scanner;
 
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N%2 == 0 ? N/2 : N/2+1);
	}
}