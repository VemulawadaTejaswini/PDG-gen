import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	 	int a = sc.nextInt();
 		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int powk = ((int) Math.pow(2, k));
		int answer = 0;

		if (a > b && a > c) {
			answer = a * powk + b + c;
		} else if (b > a && b > c) {
			answer = b * powk + a + c;
		} else {
			answer = c * powk + a + b;
		}

		System.out.println(answer);
  }
}
