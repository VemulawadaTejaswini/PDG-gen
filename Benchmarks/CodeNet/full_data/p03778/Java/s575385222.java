import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int W = sc.nextInt();
		if((a<=b&&b<=a+W)||(b<=a&&a<=b+W)) {
			System.out.println("0");
		}else if(b>a&&a+W<b) {
			System.out.println(b-a-W);
		}else if(a>b&&b+W<a) {
			System.out.println(a-b-W);
		}
	}

}