import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = Integer.parseInt(scn.next());
		int m = Integer.parseInt(scn.next());

		long[] X = new long[n];
		long[] Y = new long[m];

		for(int i=0;i<n;i++){
			X[i] = Long.parseLong(scn.next());
		}
		for(int i=0;i<m;i++){
			Y[i] = Long.parseLong(scn.next());
		}

		long sum = 0;

		for(int ysize=1;ysize<m;ysize++){
			for(int xsize=1;xsize<n;xsize++){
				for(int y=0;y<m-ysize;y++){
					for(int x=0;x<n-xsize;x++){
						sum += ((X[x+xsize] - X[x])%1000000007) * ((Y[y+ysize] - Y[y])%1000000007)%1000000007;
						sum %= 1000000007;
					}
				}
			}
		}
		System.out.println(sum);
    }
}