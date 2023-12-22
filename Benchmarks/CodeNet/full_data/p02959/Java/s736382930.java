import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap hs = new HashMap();
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n + 1];
		int[] b = new int[n];
		for(int i = 0 ; i <= n ; i++){
			a[i] = Integer.parseInt(sc.next());
		}
		for(int i = 0 ; i < n ; i++){
			b[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		long yono = 0;
		for(int i = 0 ; i < n ; i++){
			if(a[i] >= b[i]){
				a[i] -= b[i];
				yono += b[i];
			}else{
				b[i] -= a[i];
				yono += a[i];
				yono += Math.min(b[i] , a[i + 1]);
				a[i + 1] -= Math.min(a[i + 1] , b[i]);
			}
		}
		ou.print(yono + "\n");
		ou.flush();
	}
}