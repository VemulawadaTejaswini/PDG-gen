import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long x = scanner.nextLong();
		long answer = x / 11 * 2;
		if(x % 11 < 6 && x % 11 != 0){
			answer += 2;
		}else if(x % 11 !=0){
			answer ++;
		}

		System.out.println(answer);
	}

}
