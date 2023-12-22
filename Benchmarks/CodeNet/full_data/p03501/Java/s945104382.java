import java.util.Scanner;

class Main{
	public static void main(String[] ars) {
		Scanner sc=new Scanner(System.in);
		int Hour=sc.nextInt();
		int wa=sc.nextInt();
		int a=sc.nextInt();

		if(Hour*wa>a) {
			System.out.println(a);
		}

		else if(Hour*wa<=a) {
			System.out.println(Hour*wa);
		}
	}
}