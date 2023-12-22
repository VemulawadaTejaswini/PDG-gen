import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double a=0,b=0;
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println((int)(Math.ceil((b-1)/(a-1))));

	}
}
