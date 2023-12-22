import java.util.Scanner;
import java.util.stream.Stream;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = list[0]; 
		int K = list[1]; 
		String[] S = sc.nextLine().split("");
		
		for(int i=0;i<N;i++) {
			if(i==K-1) {
				System.out.print(S[i].toLowerCase());
			}
			else {
				System.out.print(S[i]);
			}
		}
	}
}
