import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long buff1=x+a;
		long buff2=x+b;
		long buff3=a+b;

		if(buff1<buff2 && buff1<buff3) {
			System.out.println(buff1);
		}else if(buff2<buff1&&buff2<buff3) {
			System.out.println(buff2);
		}else {
			System.out.println(buff3);
		}

	}
}


