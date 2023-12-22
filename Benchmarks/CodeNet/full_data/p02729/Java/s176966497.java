import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt(),M=sc.nextInt();
		int ans =0;
		while(N!=0) {
			N--;
			ans=ans+N;
		}
		while(M!=0) {
			N--;
			ans=ans+N;
		}
		System.out.println(ans);
		

	}

}
