import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), m=sc.nextInt();
		sc.close();
		if(n>1 && m>1) System.out.println((n-2)*(m-2));
		else {
			int ans=n*m;
			if(ans>1) System.out.println(ans-2);
			else System.out.println("1");
		}
	}
}