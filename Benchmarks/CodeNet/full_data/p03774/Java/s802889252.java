import java.util.Scanner;
public class cheak {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[m];
		int[] d = new int[m];
		int min = 100000001,index = 0,date = 100000001;
		for(int i = 0; i < n; i++){
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
		}
		
		for(int i = 0; i < m; i++){
			c[i] = scan.nextInt();
			d[i] = scan.nextInt();
		}
		
		for(int i = 0;i < n; i++){
			for(int j = 0; j < m; j++){
				date = Math.abs(a[i] - c[j]) + Math.abs(b[i] - d[j]);
				if(date < min){
					min = date;
					index = j;
				}
			}
			System.out.println(index + 1);
			min = 999999999;
			index = 0;
		}
			
	}
 
}