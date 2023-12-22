import java.io.*;

public class Main{
	public static final int YEAR = 2019;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int L = Integer.parseInt(line[0]);
		int R = Integer.parseInt(line[1]);
		
//		if( R - L != R%YEAR - L%YEAR ){
//			System.out.println(0);
//		}else{
			int min = L*(L+1)%YEAR;
			for(int i=L+1; i<R; i++)
				if( L*(L+1)%YEAR < min )
					min = L*(L+1)%YEAR;
			System.out.println(min);
//		}
	}
}
