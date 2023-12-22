import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N, ans = 0;

		N = Integer.parseInt(sc.next());

		int[] a = new int[N];

		for(int i = 0; i < N; i++){
			a[i] = Integer.parseInt(sc.next());
		}

		int l = 0;
		int r = N-1;

		int x = 0;
		int y = 0;

		while(l <= r){
			if(x <= y){
				x += a[l++];
			}else{
				y += a[r--];
			}
		}

		ans = Math.abs(x - y);

		System.out.println(ans);

	}

}