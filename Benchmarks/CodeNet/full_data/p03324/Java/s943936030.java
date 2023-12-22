import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0;
		if(a==0) {
			c=1;
		}
		else if(a==1) {
			c=100;
		}
		else if(a==2) {
			c=10000;
		}

		System.out.println(c*b);
	}
}