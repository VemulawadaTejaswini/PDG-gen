import java.util.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		B(sc);
	}
	
	public static void B(Scanner sc) {
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int counter = 0;
		for(int a=0;a<=A;a++){
			for(int b=0;b<=B;b++) {
				int c = (X-(500*a+100*b))/50;
				if(0<=c && c<=C) counter++;
			}
		}
		out.println(counter);
	}
}
