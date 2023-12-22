import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int[] a = new int[4];
		for(int i = 0 ; i < 4 ; i++) a[i] = Integer.parseInt(sc.next());
		sc.close();
		if((Math.abs(a[0] - a[1]) <= a[3] && Math.abs(a[1] - a[2]) <= a[3]) || Math.abs(a[0] - a[2]) <= a[3]) ou.println("Yes");
		else ou.println("No");
		ou.flush();
	}
}