import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());
		int[] result = {-1, -1, -1};
		for(int sen=0; sen<=N; sen++) {
			for(int go=0; go<=N-sen; go++) {
				int sum = sen*1000 + go*5000 + (N-sen-go)*10000;
				if(sum == Y) {
					result[0] = sen;
					result[1] = go;
					result[2] = N-sen-go;
				}
			}
		}

		System.out.println(result[2] + " " + result[1] + " " + result[0]);
	}
}