import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		long N=input.nextInt(),K=input.nextInt(),X=(N/K);
		if(K%2 == 1) {
			System.out.println((N/K)*(N/K)*(N/K));
		}
		else {
			if(N%K>=K/2) {
				X+=1;
			}
			System.out.println((N/K)*(N/K)*(N/K)+X*X*X);
		}
	}
}