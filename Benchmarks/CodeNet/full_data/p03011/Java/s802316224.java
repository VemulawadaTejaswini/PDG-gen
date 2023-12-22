import java.util.Scanner;
import java.util.stream.Stream;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] S = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//		String[] S = sc.nextLine().split("");
		
		int P   = S[0];
		int Q   = S[1];
		int R   = S[2];
		int min_value=0;
		
		min_value = P + Q;
		
		if(R + Q < min_value) min_value = R + Q;
		if(P + R < min_value) min_value = P + R;
		if(Q + R < min_value) min_value = Q + R;
		if(R + P < min_value) min_value = R + P;
		if(Q + P < min_value) min_value = Q + P;
		
		System.out.print(min_value);
	}
}
