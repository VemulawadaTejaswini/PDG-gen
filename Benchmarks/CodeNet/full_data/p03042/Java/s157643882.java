import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		int a=Integer.valueOf(S.substring(0,2));
		int b=Integer.valueOf(S.substring(2,4));
		if(a<=12&&b<=12&&a>0&&b>0)
			System.out.println("AMBIGUOUS");
		if(a<=12&&b>12&&a>0&&b>0)
			System.out.println("MMYY");
		if(a>12&&b<=12&&a>0&&b>0)
			System.out.println("YYMM");
		if(a>12&&b>12&&a>0&&b>0)
			System.out.println("NA");
		if(a==0||b==0)
			System.out.println("NA");
	}
}