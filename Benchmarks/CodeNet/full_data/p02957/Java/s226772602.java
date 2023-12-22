import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int k;

		if(a==b) {
			System.out.println("0");
		}else {
			if(a%2==b%2) {
				k=(a+b)/2;
				if((a-k<0&&b-k>0)||(a-k>0&&b-k<0)) {
					System.out.println(k);
				}
			}else {
				System.out.println("IMPOSSIBLE");
			}
		}
	}
}
