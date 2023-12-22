import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt(),b=scan.nextInt(),k=scan.nextInt(),m=a+k-1,i;
		for(i=a;a+k>i;i++) if(b>=i) System.out.println(i);
		for(i=b-k+1;b>=i;i++) if(i>m&&i>=a) System.out.println(i);
	}
}