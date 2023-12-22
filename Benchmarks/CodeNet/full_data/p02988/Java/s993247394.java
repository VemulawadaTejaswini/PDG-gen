import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int N = scan.nextInt();
		 int p[] = new int[N];
		 
		 for (int i = 0; i < N; i++ ) {
			 p[i] = scan.nextInt();
		 }
		 
		 
		 int p_1;
		 int p_2;
		 int p_3;
		 int cnt = 0;
		 
		 for (int i = 0; i < N - 2; i++) {
			 p_1 = p[i];
			 p_2 = p[i + 1];
			 p_3 = p[i + 2];
			 
			 if (p_1 < p_2 && p_2 < p_3) {
				cnt++; 
			 } else if (p_3 < p_2 && p_2 < p_1) {
				cnt++;
			 }
		 }
		 
		 System.out.println(cnt);
		 
		 scan.close();

	}

}
