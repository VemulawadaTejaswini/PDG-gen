import java.util.Scanner;
public class Main{
	public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
	String a=scan.next();
	int b=a.length();
	System.out.println(b%2==0?b/2:b/2+1);
	}
}