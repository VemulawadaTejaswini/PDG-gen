import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static int A,B,C;
	//static String ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A=sc.nextInt();
		B=sc.nextInt();

		C=sc.nextInt();
		int a[]=new int[100];
		for(int i=1;i<=A;i++) {
			if(A%i==0&&B%i==0) {
				a[i]=i;
			}
		}
		Arrays.sort(a);
		System.out.println(a[100-C]);
	}
}
