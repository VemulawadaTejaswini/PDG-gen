import java.util.*;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int op1=-1;
		if(str.indexOf("+")!=-1)op1=str.indexOf("+");
		else if(str.indexOf("-")!=-1)op1=str.indexOf("-");
		char op2=str.charAt(op1);
		int a=Integer.parseInt(str.substring(0, op1));
		int b=Integer.parseInt(str.substring(op1+1));
		if(op2=='+')
			System.out.println(a+b);
		else if(op2=='-')
			System.out.println(a-b);
		}
}