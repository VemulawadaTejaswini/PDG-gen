import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int t = Integer.parseInt(sc.next());
		int[] a = new int[t];
		for(int i = 0 ; i < t ; i++) a[i] = Integer.parseInt(sc.next());
		sc.close();
		Arrays.sort(a);
		if(t == 1){
			ou.print(n - 1 + "\n");
		}else if(n / 2 >= a[t - 1]) ou.print("0\n");
		else ou.print(a[t - 1] - n / 2 + "\n");
		ou.flush();
    }
}