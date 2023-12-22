import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt(),b=stdIn.nextInt(),c=stdIn.nextInt(),x=stdIn.nextInt(),s=0,i,j,k;
		for(i=0;i<=a;i++) for(j=0;j<=b;j++) for(k=0;k<=c;k++) if(500*i+100*j+50*k==x) s++;
		System.out.print(s);
	}
}