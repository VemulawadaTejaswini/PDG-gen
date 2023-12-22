import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x[][] = new int[3][m + 1];
		x[0][0] =0;
		x[1][0] = 0;
		x[2][0] = 0;
int deta[]=new int[n+1];
Arrays.fill(deta,0);
int key	=0;
		for (int i = 1; i <= m; i++) {
			x[0][i] = sc.nextInt();
			x[1][i] = sc.nextInt();
			x[2][i] = sc.nextInt();
if(deta[x[0][i]]==0||deta[x[1][i]]==0){
key++;
}
deta[x[0][i]]++;
deta[x[1][i]]++;
		}



		System.out.println(n-key);
	}
}