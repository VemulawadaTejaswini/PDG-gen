import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n=in.nextInt();
		long sum=0;
		for(long i=0;i<=n;i++) {
			if(i%3!=0 && i%5!=0)sum+=i;
		}
		System.out.println(sum);
	}

}
