import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();

		if(b==0 && a>0) {
			System.out.println(a);
		}
		else if(a<=0 && b==0) {
			System.out.println("0");
		}
		else{
			System.out.println(Math.max(Math.max(a+b,a-b), Math.max(a/b,a*b )));
		}
	}
}