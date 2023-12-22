import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputLine = sc.nextLine();
		String[] tokens = inputLine.split(" ");
		int N = Integer.parseInt(tokens[0]);
		int K = Integer.parseInt(tokens[1]);
		if(N <= K)System.out.println(1);
		else System.out.println(Math.ceil((N-K)/(double)(K-1))+1);
	}
}
