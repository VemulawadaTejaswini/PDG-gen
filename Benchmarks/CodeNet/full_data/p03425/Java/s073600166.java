import java.io.BufferedReader;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = 0;
		int A = 0;
		int R = 0;
		int C = 0;
		int H = 0;
		for(int i = 0; i < N; i++) {
			String Si = sc.next();
			switch(Si.substring(0, 1)) {
			case "M":
				M++;
				break;
			case "A":
				A++;
				break;
			case "R":
				R++;
				break;
			case "C":
				C++;
				break;
			case "H":
				H++;
				break;
			}
		}
		long answer = 0;
		answer = M*A*R;
		answer += M * A * C;
		answer += M * A * H;
		answer += M * R * C;
		answer += M * R * H;
		answer += M * C * H;
		answer += A * R * C;
		answer += A * R * H;
		answer += A * C * H;
		answer += R * C * H;
		
		System.out.println(answer);
	}
}