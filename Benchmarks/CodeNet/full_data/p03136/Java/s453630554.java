import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b[]=new int[a];
		for(int i=0;i!=a;i++) {
			b[i]=scan.nextInt();
		}
		Arrays.sort(b);
		int ans=0;
		for(int i=0;i!=a-1;i++) {
			ans+=b[i];
		}
		if(b[a-1]>=ans) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
		}
}