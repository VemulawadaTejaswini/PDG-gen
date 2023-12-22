import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int w = in.nextInt();
		boolean[][] a = new boolean[h][w];
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				a[i][j] = in.nextInt()%2==0;
			}
		}
		int n = 0;
		StringBuilder sb = new StringBuilder();
		String ls = System.lineSeparator();
		for(int i=0;i<h;i++) {
			for(int j=1;j<w;j++) {
				if(a[i][j-1]) continue;
				sb.append((i+1)+" "+j+" "+(i+1)+" "+(j+1)+ls);
				n++;
				if(a[i][j]) a[i][j] = false;
				else a[i][j] = true;
			}
		}
		for(int i=1;i<h;i++) {
			if(a[i-1][w-1]) continue;
			sb.append(i+" "+(w-1)+" "+(i+1)+" "+(w-1)+ls);
			n++;
			if(a[i][w-1]) a[i][w-1] = false;
			else a[i][w-1] = true;
		}
		
		System.out.println(n);
		System.out.println(sb.toString());
		

	}

}
