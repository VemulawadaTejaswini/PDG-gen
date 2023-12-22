import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double t = sc.nextDouble();
		double a = sc.nextDouble();
		int answer = 0;
		double answertempdiff = Integer.MAX_VALUE;
		for(int i =1;i <= n;i++) {
			double temp = t - (sc.nextDouble() * 0.006);
			if(Math.abs(a - temp) < answertempdiff) {
				answer = i;
				answertempdiff = Math.abs(a - temp);
			}
		}
		System.out.println(answer);
	}
}