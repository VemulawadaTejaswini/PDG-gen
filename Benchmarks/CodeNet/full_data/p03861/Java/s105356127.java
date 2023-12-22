import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong(),b=sc.nextLong(),x=sc.nextLong();
		long count = 1;

		/*for(long i=a;i<=b;i++) {
			if(i%x==0) {
				break;
			}
		}*/

		/*if() {
			System.out.println();
		}else {
			System.out.println(0);
		}*/
		System.out.println((long)(b/x)-(long)((a-1)/x));


	}
	public static int sample(int n) {
		return n;
	}

}
