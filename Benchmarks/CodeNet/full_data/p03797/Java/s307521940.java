import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner scan=new Scanner(System.in);
long a=scan.nextInt();
long b=scan.nextInt();
long i=0;
if(2*a>=b) {i=b/2;}
else if(2*a<b) {i=a;b=b-(2*a);i+=b/4;}
System.out.println(i);
}
}