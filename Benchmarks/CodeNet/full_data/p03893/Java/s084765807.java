import java.util.*;

public class    Main {
			
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);			
		int n=input.nextInt();		
		int s=f(n);
		System.out.println(s);
	}

	private static int f(int n) {
		if(n==0)
			return 2;
		return (f(n-1)*2)+2;
		
	}
}