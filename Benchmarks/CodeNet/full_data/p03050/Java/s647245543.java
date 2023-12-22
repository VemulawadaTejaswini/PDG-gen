import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long sum = 0;
		int i=1;
		while(i<(n-i)/i) {
			if(n%i==0) 
				sum+=(n-i)/i;
			i++;
		}
		System.out.print(sum);
		

	}

}