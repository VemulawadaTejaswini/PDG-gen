import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		long b[]=new long[a];
		for(int i=0;i!=a;i++) {
			b[i]= scan.nextLong();
		}
		Arrays.sort(b);
		long sum=0;
		if(b.length==1) {sum=1;}
		else if(b.length==2) {sum=b[1]-b[0];}
		else {
		for(int i=a-1;i!=1;i--) {
			sum+=b[i]-b[i-1];
		}
		}
		if(sum%2==1) {
			System.out.println("first");}
		else {System.out.println("second");}
}
}