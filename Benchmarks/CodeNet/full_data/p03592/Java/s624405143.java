import java.util.Scanner;
class Main{
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		boolean bool=false;
		for(int i=0;i<=a;i++) {
			for(int j=0;j<=b;j++) {
				int bla=0;
				bla+=i*a;
				bla+=j*b;
				bla-=i*j*2;
				if(bla==c) {
					bool=true;
				}
			}
		}
		System.out.println(bool?"Yes":"No");
	}
}