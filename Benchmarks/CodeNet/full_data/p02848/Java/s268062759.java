
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
String S="ABCXYZ";
Scanner in=new Scanner(System.in);
int n=in.nextInt();

String temp = S.substring(n);
String temp2=S.substring(0,n);
S=temp;
S+=temp2;
System.out.println(S);



	}

}
