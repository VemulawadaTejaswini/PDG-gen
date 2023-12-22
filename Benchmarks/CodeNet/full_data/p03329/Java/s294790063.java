import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		partC();


	}

	public static void partC() {
		Scanner scC = new Scanner(System.in);
		int N = scC.nextInt();
		int count = 0;

		while(true) {
			if(N >= 59049) {
				N -= 59049;
				count++;
			}else if (N >= 46656) {
				N -= 46656;
				count++;
			}else if(N >= 7776) {
				N -= 7776;
				count++;
			}else if(N >= 6561) {
				N -= 6561;
				count++;
			}else if(N >= 1296) {
				N -= 1296;
				count++;
			}else if(N >= 729) {
				N -= 729;
				count++;
			}else if(N >= 216) {
				N -= 216;
				count++;
			}else if(N >= 81) {
				N -= 81;
				count++;
			}else if(N >= 36) {
				N -= 36;
				count++;
			}else if(N >= 9) {
				N -= 9;
				count++;
			}else if(N >= 6) {
				N -= 6;
				count++;
			}else if(N >= 0) {
				count += N;
				break;
			}
		}

		System.out.println(count);

	}
}