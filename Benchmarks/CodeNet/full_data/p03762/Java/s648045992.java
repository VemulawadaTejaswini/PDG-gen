import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x[] = new int[n];
		for(int i=0; i<n; i++){
			x[i]  = sc.nextInt();
		}
		int y[] = new int[m];
		for(int i=0; i<m; i++){
			y[i]  = sc.nextInt();
		}

		int yoko_kumiawase = n * (n-1) / 2;
		int tate_kumiawase = m * (m-1) / 2;
		
		long[] yoko = new long[yoko_kumiawase];
		long[] tate = new long[tate_kumiawase];
		
		int count = 0;
		for(int i=0; i<n-1; i++){
			for(int j=i+1; j<n; j++){
				yoko[count] = x[j] - x[i];
				count++;
			}
		}
		count = 0;
		for(int i=0; i<m-1; i++){
			for(int j=i+1; j<m; j++){
				tate[count] = y[j] - y[i];
				count++;
			}
		}
		
		long sum = 0;
		for(int i=0; i<yoko_kumiawase; i++){
			for(int j=0; j<tate_kumiawase; j++){
				sum += (long)(yoko[i] * tate[j]);
				sum = sum % 1000000007;
			}
		}
		System.out.print(sum);
		
	}

}
