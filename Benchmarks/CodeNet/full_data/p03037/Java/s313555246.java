import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			int N, M;
			N = Integer.parseInt(sc.next());
			M = Integer.parseInt(sc.next());

			int iniMax = 0, endMin = M;

			for (int i = 0; i < N; i++) {
				int ini = Integer.parseInt(sc.next());
				int end = Integer.parseInt(sc.next());

				iniMax = Math.max(iniMax, ini);
				endMin = Math.min(endMin, end);
			}

			System.out.println((endMin - iniMax + 1));
		}
		 catch (Exception e) {
			// TODO: handle exception
		}

	}

}
