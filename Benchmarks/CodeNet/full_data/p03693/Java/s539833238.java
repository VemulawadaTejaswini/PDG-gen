import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String r=scan.next(),g=scan.next(),b=scan.next();
	String s=r+g+b;
	int i=Integer.parseInt(s);
	if((i)%4==0) {
		System.out.println("YES");
	}
	else {
		System.out.println("NO");
	}

	}

}