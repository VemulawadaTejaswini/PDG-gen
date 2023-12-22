import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),k=sc.nextInt();

		for(int i=0; i<k;i++) {
			if(a>=b) {
				if(a>=c) {
					a*=2;
				}else {
					c*=2;
				}
			}else {
				if(b>=c) {
					b*=2;
				}else {
					c*=2;
				}
			}
		}
		System.out.println(a+b+c);

	}
}