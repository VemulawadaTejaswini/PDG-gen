import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	for(int i=a;;i++) {
		int e=i;
		int b=e%10;
		e/=10;
		int c=e%10;
		e/=10;
		int d=e%10;
		if(b==d&&c==d) {
			System.out.println(i);
			break;
		}
	}
	scan.close();
}
}
