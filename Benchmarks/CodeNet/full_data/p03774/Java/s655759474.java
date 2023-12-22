import java.util.Scanner;

public class Main {
	 	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[m];
		int[] d = new int[m];
		int s = 99999999, t= 99999999 ,u=0;
		for(int i = 0; i < t; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}		
		for(int i = 0; i < s; i++){
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		
		for(int i = 0;i < t; i++){
			for(int j = 0; j < s; j++){
				t = Math.abs(a[i] - c[j]) + Math.abs(b[i] - d[j]);
				if(t < s){
					s = t;
					u = j;
				}
			}
			System.out.println(u+ 1);
			s = 999999999;
			u = 0;
		}
		sc.close();	
	}
 
}