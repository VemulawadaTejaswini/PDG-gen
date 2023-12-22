import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		long yono = 0;
		for(int i = 0 ; i < n ; i++){
			a[i] = Integer.parseInt(sc.next()) - i;
		}
		sc.close();
		Arrays.sort(a);
		yono = a[n / 2] - 1;
		long sad = 0;
		for(int i = 0 ; i < n ; i++){
			sad += Math.abs(a[i] - yono);
		}
		long sada = 0;
		yono++;
		for(int i = 0 ; i < n ; i++){
			sada += Math.abs(a[i] - yono);
		}
		sad = Math.min(sad , sada);
		sada = 0;
		yono++;
		for(int i = 0 ; i < n ; i++){
			sada += Math.abs(a[i] - yono);
		}
		sad = Math.min(sad , sada);
		ou.println(sad);
		ou.flush();
	}
}