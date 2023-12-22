import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = N%2;
		
		if(a==0) {
			System.out.print(N/2);
		}else {
			System.out.println(N/2+1);
		}
		
		sc.close();
	}
}