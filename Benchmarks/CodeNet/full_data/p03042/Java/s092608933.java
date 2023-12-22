import java.util.Scanner;


public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		String s=sc.next();

		char c[]=s.toCharArray();
		int a=(c[0]-'0')*10 + (c[1]-'0');
		int b=(c[2]-'0')*10 + (c[3]-'0');

		if(a>12||a==0){
			if(b>12 || b==0)System.out.println("NA");
			else System.out.println("YYMM");
		}
		else if(b>12 || b==0)System.out.println("MMYY");
		else System.out.println("AMBIGUOUS");

	}
}