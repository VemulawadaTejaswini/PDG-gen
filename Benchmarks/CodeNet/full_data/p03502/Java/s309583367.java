import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int n=N;
		int sum=0;
		for(int i=0;i<8;i++) {
			sum+=N%10;
			n=N/10;
		}
		if(N%sum==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
