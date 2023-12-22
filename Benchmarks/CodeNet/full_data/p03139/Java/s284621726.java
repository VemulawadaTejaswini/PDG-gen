import java.time.chrono.MinguoChronology;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ansMin = 0;
		int ansMax = 0;
		if(a == b && b==c) {
			ansMin = a;
			ansMax = a;
		} else if ( a/2 <= b && a/2 <= c && a <= b+c) {
			if(b > c) {
				ansMin = b-a/2;
				ansMax=c;
			} else {
				ansMin = c-a/2;
				ansMax=b;
			}
		}else if ( a/2 <= b || a/2 <= c && a <= b+c) {
			ansMin = b+c-a;
			if(b > c) {
				ansMax=c;
			} else {
				ansMax=b;
			}
		}
		else {
			ansMin = 0;
			if(b > c) {
				ansMax=c;
			} else {
				ansMax=b;
			}
		}
		System.out.println(ansMax+" "+ansMin);
		
	}

}
