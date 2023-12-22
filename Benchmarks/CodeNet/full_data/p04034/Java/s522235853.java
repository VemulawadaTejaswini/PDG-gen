import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int box[] = new int[N];
		int box_red[] = new int[N];

	//	int x[] = new int[N];
	//	int y[] = new int[M];
		int x;
		int y;

		int ans = 0;

		for (int i = 0; i < N; i++){
			if (i==0)box_red[i] = 1;
			else box_red[i] = 0;

			box[i] = 1;
		}

		for (int i = 0; i < M; i++) {
			x = sc.nextInt();
			y = sc.nextInt();

			if(box_red[x-1]> 0){
			box_red[y-1] = box_red[y-1] + 1;
			if(box[x-1] == 1){
			box_red[x-1] = box_red[x-1] - 1;
			}
			}

			if(box[x-1]>0){
			box[y-1] ++;
			box[x-1] --;
			}
		}

		for (int i = 0; i < N; i++){
			if(box_red[i]>0) ans ++;
		}
		System.out.println(ans);
		sc.close();

	}
}

