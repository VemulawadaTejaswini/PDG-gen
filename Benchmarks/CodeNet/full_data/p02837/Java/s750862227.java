import java.util.Scanner;
public class Main{
	public static int []syoujiki(int[]a,int[][]b,int[][]c) {
		int[] d = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			d[i] = -1;
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i]; j++) {
				
				if(d[b[i][j]-1]== 0 && c[i][j] == 1 ) {
					d[b[i][j]-1] =0;		
					continue;
				}
				
				d[b[i][j]-1] = c[i][j];
		
			}
		}
		
		
		
		return d;
	}
	
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt(); //人数
		int [] a = new int[n];
		int [] []b = new int[n][n]; 
		int [] []c = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
			for(int j = 0; j < a[i]; j++) {
				b[i][j] = stdIn.nextInt(); //ex)b[i][j] == 3であると、3人目の人が対象
				c[i][j] = stdIn.nextInt(); //b[i][j]個目の証言が正直か不親切か
				}
			}
		
			int [] d = syoujiki(a,b,c);
			
			int cnt = 0;
			for(int i = 0; i < d.length; i++) {
				if(d[i] ==1) {
					cnt++;
				}
			}
			System.out.println(cnt);
		
		
	}

}
