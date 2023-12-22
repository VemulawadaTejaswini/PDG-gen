import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int D=sc.nextInt();
		int N=sc.nextInt();
		int answer=0;
		if( N!=100) {
			answer=N*(int)Math.pow(100,D);
		}else {
			answer=101*(int)Math.pow(100, D);
		}
		System.out.println(""+answer);
	}
}