import java.util.Scanner;

public class Main{
	static int keta(int s) {
		int sum = 0;
		while(s > 0) {
			sum += (s % 10);
			s /= 10;
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
		int[] keta = new int[N + 1];
		for(int i = 0; i < N + 1; i++) keta[i] = keta(i);
		int sum = 0;
		for(int i = 1; i < N + 1; i++) {
			if(keta[i] >= A && keta[i] <= B) sum += i;
		}
		System.out.println(sum);
	}
}
