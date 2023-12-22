import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	String a=scan.next();
	String b=scan.next();
	String ans="";
	for(int i=0;i!=a.length()+b.length();i++) {
		char ch=' ';
		if(i%2==0) {
			ch=a.charAt(i/2);
		}
		else {
			ch=b.charAt(i/2);
		}
		ans+=ch;
	}
	System.out.println(ans);
}
}