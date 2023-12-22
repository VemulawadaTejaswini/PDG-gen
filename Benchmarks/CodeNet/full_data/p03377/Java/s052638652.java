import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int m = stdin.nextInt();
		int N[] = new int[m];
			for (int i = 0; i < m; i++) {
				N[i] = stdin.nextInt();
				}
			int y[] = N.clone();
			Arrays.sort(y);
			int l = y[m/2-1];
			int r= y[m/2];
			
			for (int k=0;k<m;k++) {
				if(N[k]<=l) {
					System.out.println(r);
				}else {
					System.out.println(l);

				}
			}
			}

		}