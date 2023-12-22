import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		//double check =  Math.pow(Math.E, Math.log(N)/2);
		double check = Math.sqrt(N);
		double num = Math.floor(check);
		double ans = Math.pow(num, 2);
		int answer = (int) ans;
		System.out.println(answer);
	}

}
