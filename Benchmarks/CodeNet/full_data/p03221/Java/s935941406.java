import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int M = sc.nextInt();
			int table[][] = new int[N+1][M+1];
			int set[] = new int[N+1];
			int input[][] = new int[M+1][2];
			for(int i = 1; i <= M; i++) {
				input[i][0] = sc.nextInt();
				input[i][1] = sc.nextInt();
				set[input[i][0]]++;
				table[input[i][0]][set[input[i][0]]] = input[i][1];
			}
			for(int k = 1; k <= M; k++) {
				int order = 1;
				for(int i = 1; i <= set[input[k][0]]; i++) {
					if(input[k][1] > table[input[k][0]][i]) {
						order++;
					}
				}
				System.out.println(String.format("%06d",input[k][0]) + String.format("%06d",order));
			}
		sc.close();
	}
}