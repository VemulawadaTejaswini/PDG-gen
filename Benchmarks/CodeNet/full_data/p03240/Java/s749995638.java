import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[]x = new int[N];
		int[]y = new int[N];
		int[]h = new int[N];
		for(int i = 0; i < N; i++) {
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
			h[i] = scan.nextInt();
		}
		scan.close();
		for(int cx = 0; cx <= 100; cx++) {
			for(int cy = 0; cy <= 100; cy++) {
				int t = 0;
				for(int i = 0; i < N; i++) {
					boolean flag = true;
					if(h[i] >= 0) {
						t = h[i] + Math.abs(x[i] - cx) + Math.abs(y[i] - cy);
						if(t == 6) {
							//System.out.println(cx + " " + cy);
						}
						for(int j = 0; j < N; j++) {
							int k = t - Math.abs(x[j] - cx) - Math.abs(y[j] - cy);
							if(k != h[j]) {
								flag = false;
								break;
							}else {

							}
						}
						if(flag) {
							System.out.println(cx + " " + cy  + " " + t);
							System.exit(0);
						}
					}
				}

			}
		}
	}
}