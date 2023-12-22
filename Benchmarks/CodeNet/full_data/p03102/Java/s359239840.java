import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		
		int B [] = new int [M];
		for (int i=0; i<M; i++){
			B[i]=sc.nextInt();
		}
		int cnt = 0;
		for (int i=0; i<N; i++){
			int temp = 0;
			
			for (int j=0; j<M; j++){
				int aj = sc.nextInt();
				temp+=(B[j]*aj);
			}
			if (temp+C>0)
				cnt++;
		
		}
		System.out.println(cnt);
		sc.close();
	}

}