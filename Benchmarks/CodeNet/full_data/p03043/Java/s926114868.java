import java.util.Scanner;

public class Main {

	public static double coin(int point, int border){
		int count = 0;

		while(point < border){
			point *= 2;
			count++;
		}

		return 1.0 / (double)Math.pow(2, count);
	}

	public static double dice(int num, int border){
		double winRate= 0.0;

		for(int i = 1; i <= num; i++){
			winRate += 1.0 / (double)num * coin(i, border);
		}

		return winRate;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		int num = scan.nextInt();
		int border = scan.nextInt();

		// check
		double winRate = dice(num, border);

		// answer
		System.out.println(winRate);
	}
}

