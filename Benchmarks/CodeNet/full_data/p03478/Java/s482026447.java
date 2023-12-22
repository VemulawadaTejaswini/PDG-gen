import java.util.*;

class Main {
	static int sumOfDigit(int x) {
		int sum=0;
		while (true) {
			if (x<10) {
				sum+=x;
				break;
			}
			sum+=x%10;
			x=(x-x%10)/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		int sum=0;
		for (int i=1;i<=N;i++) {
			if (A<=sumOfDigit(i) && sumOfDigit(i)<=B) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}