
import java.util.Scanner;


public class Main {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i=0;i<10000;i++) {
			if(a<=0.08*i && 0.08*i<a+1 && b<=0.1*i && 0.1*i<b+1) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}

}