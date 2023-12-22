import java.util.Scanner;
public class B_checkpoint {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[m];
		int[] d = new int[m];
		int data = 99999999,check = 0,min = 99999999;
		for(int i = 0;i < n;i++){
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
		}
		for(int i = 0;i < m;i++){
			c[i] = scan.nextInt();
			d[i] = scan.nextInt();
		}
		for(int i = 0;i < n;i++){
			check = 0;
			for(int j = 0;j < m;j++){
				data = Math.abs(a[i] - c[j]) + Math.abs(b[i] - d[j]);
				if(data < min) {
					min = data;
					check = j;
				}
			}
			System.out.println(check+1);
			min = 100000001;
		}
	}
}
