import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	int c1=((Math.abs(b-c)+1)+a-1);
	int st=1;
	for(int i=c1,count=0;count<a-1;count++,i--) {
		st*=i;
	}
		st/=(4*3*2*1);
		if(b>c) {
			st=0;
		}
		if(a==1&&b==c) {
			st=1;
		}
	System.out.println(st);
	}
}
