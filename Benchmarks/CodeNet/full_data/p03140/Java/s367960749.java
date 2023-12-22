import java.util.Scanner;
public class Main{
	public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
	long a=scan.nextInt();
	String b=scan.next();
	String c=scan.next();
	String d=scan.next();
int ans=0;
	for(int i=0;i<a;i++) {
		char x=b.charAt(i);
		char y=c.charAt(i);
		char z=d.charAt(i);
		if(x==y&&y==z) {
		}
		else if(x==y||y==z||x==z) {
			ans++;
		}
		else {
			ans+=2;
		}
	}
	System.out.println(ans);
	}
}