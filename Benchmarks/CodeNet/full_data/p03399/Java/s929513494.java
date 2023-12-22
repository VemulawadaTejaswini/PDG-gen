import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdin =new Scanner(System.in);
		int a=stdin.nextInt();
		int b=stdin.nextInt();
		int c=stdin.nextInt();
		int d=stdin.nextInt();
		int train=a;
		int bus=c;
		if(a>b)
			train=b;
		if(c>d)
			bus=d;
		System.out.println(train+bus);

	}
}