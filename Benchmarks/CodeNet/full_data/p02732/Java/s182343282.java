import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		long[] b = new long[n];
		for(int i = 0 ; i < n ; i++){
			a[i] = Integer.parseInt(sc.next()) - 1;
			b[a[i]]++;
		}
		sc.close();
		long yono = 0;
		for(int i = 0 ; i < n ; i++){
			yono += b[i] * (b[i] - 1) / 2;
		}
		for(int i = 0 ; i < n ; i++){
			ou.print(yono - b[a[i]] + 1 + "\n");
		}
		ou.flush();
	}
}