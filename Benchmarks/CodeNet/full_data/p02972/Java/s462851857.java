import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		boolean[] a = new boolean[n];
		Arrays.fill(a , false);
		for(int i = 0 ; i < n ; i++) if(Integer.parseInt(sc.next()) == 1) a[i] = true;
		boolean[] q = new boolean[n];
		Arrays.fill(q , false);
		int yono;
		for(int i = n - 1 ; i >= 0 ; i--){
			yono = 0;
			for(int j = i ; j < n ; j += i + 1){
				if(q[j]) yono++;
			}
			if(yono % 2 == 1) a[i] = true;
		}
		yono = 0;
		for(int i = 0 ; i < n ; i++) if(a[i]) yono++;
		ou.println(yono);
		if(yono != 0){
			yono = 0;
			for(int i = 0 ; i < n && a[i]; i++){
				if(yono == 0){
					ou.print(i + 1);
					yono++;
				}else ou.print(" " + (i + 1));
			}
			ou.println();
		}
		ou.flush();
	}
}