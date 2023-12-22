import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=1;
	for(int i=a;i<=b;i++) {
		c*=i;
	}
	if(c==0) {
		System.out.println("Zero");
	}
	else {
		System.out.println(c>0?"Positive":"Negative");
	}
	scan.close();
	}
}