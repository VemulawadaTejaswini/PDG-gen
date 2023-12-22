import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int A=sc.nextInt();
		int B=sc.nextInt();
		int T=sc.nextInt();
		
		int i=T/A;
		int sum=0;
		
		for(int j=1;A*j<T;j++) {
			sum+=B;
		}
		System.out.println(sum);
	}
}