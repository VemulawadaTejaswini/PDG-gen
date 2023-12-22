import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] sArray = sc.next().toCharArray();
		int answer = 1;

		for(int i = 1; i < n; i++) {
			if(sArray[i] == sArray[i-1]) {
				continue;
			}else {
				answer++;
			}
		}
		System.out.println(answer);
	}
}