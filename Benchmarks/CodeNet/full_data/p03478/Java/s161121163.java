import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int answer = 0;
		for(int i =1;i <=n;i++) {
			int ketaGokei = getKetaGokei(i);
			if(a <=ketaGokei &&ketaGokei <=b ) {
				answer += i;
			}
		}
		System.out.println(answer);
	}

	private static int getKetaGokei(int i) {
		String[] numberArray = String.valueOf(i).split("");
		int ketaGokei = 0;
		for(String number : numberArray) {
			ketaGokei += Integer.parseInt(number);
		}
		return ketaGokei;
	}
}