import java.io.IOException;

public class Main{

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String xx = sc.next();
		String yy = sc.next();
		char[] x = xx.toCharArray();
		char[] y = yy.toCharArray();
		int[][] L = new int[x.length + 1][y.length + 1];

		for (int i = 1; i <= x.length; i++)
			for (int j = 1; j <= y.length; j++)
				if (x[i - 1] == y[j - 1]) {
					L[i][j]=L[i-1][j-1]+1;
				}
				else 
					L[i][j]=Math.max(L[i][j-1], L[i-1][j]);
		
		boolean [] take=new boolean[x.length];
		
		int i=x.length;
		int j=y.length;
		
		while(i>0 && j>0 ) {
			
			while(j>0 && L[i][j]==L[i][j-1])
					j--;
			while(i>0 && L[i][j]==L[i-1][j])
				i--;
			if(i>0) {
				take[i-1]=true;
				j--;
			}
		}
		int ctr=0;
		for(Boolean b:take) {
			if(b)
				System.out.print(x[ctr]);
			ctr++;
		}
	}
	

}
