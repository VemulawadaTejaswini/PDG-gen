import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0; i < N; i++)
			a[i] = sc.nextInt();
        int[][] s = new int[H][W];
		int h = 0, w = 0;
		for(int i = 0; i < N; i++){
			for(int j = 0; j < a[i]; j++){
				s[h][w] = i+1;
				if(h%2 == 0){
					if(w == W-1)
						h++;
					else 
						w++;
				} else {
					if(w == 0)
						h++;
					else
						w--;
				}
			}
		}
		for(int i = 0; i < H; i++){
			for(int j = 0; j < W; j++){
				System.out.print(s[i][j]);
			}
			System.out.println();
		}
    }
}
