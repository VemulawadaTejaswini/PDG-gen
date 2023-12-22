import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = Integer.parseInt(sc.next()) - 1;
		sc.close();
		boolean[] q = new boolean[n];
		Arrays.fill(q , false);
		q[0] = true;
		int now = 0;
		for(int i = 0 ; i < n ; i++){
			q[now] = true;
			now = a[now];
		}
		if(!q[1]) ou.println(-1);
		else{
			int cou = 0;
			Arrays.fill(q , false);
			now = 0;
			while(!q[1]){
				cou++;
				now = a[now];
				q[now] = true;
			}
			ou.println(cou);
		}
		ou.flush();
	}
}