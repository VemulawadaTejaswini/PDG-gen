import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int g=sc.nextInt();
		int cosu=0;

		for(int i=s; i<=g; i++) {
			int a=i/10000;
			int b=(i%10000)/1000;
			int c=(i%1000)/100;
			int d=(i%100)/10;
			int e=i%10;

			if(a==e && b==d) {
				cosu++;
			}
		}
		System.out.println(cosu);
	}
}