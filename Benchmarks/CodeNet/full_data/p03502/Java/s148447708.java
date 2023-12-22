import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=a;
		int count=0;
		for(int i=0;i!=8;i++) {
			count+=b%10;
			b/=10;
		}
		if(a%count==0) {
			System.out.println("Yes");
		}
		else {
		System.out.println("No");
		}
		}
}