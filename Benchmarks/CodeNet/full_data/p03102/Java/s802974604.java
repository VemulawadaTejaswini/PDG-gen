import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M= scan.nextInt();
		int C = scan.nextInt();
		ArrayList<Integer> times = new ArrayList();
		ArrayList<Integer> number = new ArrayList();
		int count = 0;
 
		for (int i = 0; i < M; i++){
			int B = scan.nextInt();
			times.add(B);
		}
 
		for (int i = 0; i < N; i++){
			int answer = 0;
 
			for (int j = 0; j < times.size(); j++){
				int A = scan.nextInt();
				number.add(A);
				answer += times.get(j) * number.get(j);
			}
			answer += C;
			if (answer > 0){
				count++;
			}
			number.clear();
		}
		System.out.println(count);
	}
}