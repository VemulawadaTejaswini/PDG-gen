import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		long N=sc.nextInt();
		int i;
		long ans=0;
		for(i=0;i*i<=N;i++) {
			ans=i*i;
		}
		System.out.println(ans);
	}
}