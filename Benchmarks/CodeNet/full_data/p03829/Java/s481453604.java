import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		Long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		int[] x = new int[n];
		for(int i = 0 ; i < n ; i++) x[i] = Integer.parseInt(sc.next());
		sc.close();
		long yono = 0;
		for(int i = 0 ; i < n - 1 ; i++){
			yono += Math.min(b , (x[i + 1] - x[i]) * a);
		}
		ou.print(yono + "\n");
		ou.flush();
    }
}