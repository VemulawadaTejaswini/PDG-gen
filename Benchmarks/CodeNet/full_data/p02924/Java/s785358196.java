import java.util.Scanner;

public class Main {
	public static void main(String args[]) {	
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		
		long sum=0;
		for(int i=1;i<=a-1;i++) {
			sum+=i;
			
		}
		
		
		System.out.println(sum);
	}
}
