import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] tosimiti = new int[N+1];
		for(int i =1;i<=M*2;i++) {
			tosimiti[sc.nextInt()]++;
		}

		for(int i =1;i<tosimiti.length;i++) {
		System.out.println(tosimiti[i]);
		}

	}
}
