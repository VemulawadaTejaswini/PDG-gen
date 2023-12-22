import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(),d=scan.nextInt(),x=scan.nextInt(),a,s=x,i;
		for(i=0;i<n;i++) {
			a=scan.nextInt();
			s+=(d+a-1)/a;
		}
		scan.close();
		System.out.print(s);
	}
}