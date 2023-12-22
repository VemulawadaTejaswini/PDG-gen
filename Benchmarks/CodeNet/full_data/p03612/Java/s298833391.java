import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		boolean[] che = new boolean[n];
		Arrays.fill(che , true);
		int yono = 0;
		for(int i = 1 ; i <= n ; i++) if(i == Integer.parseInt(sc.next())) che[i - 1] = false;
		for(int i = 0 ; i < n - 1 ; i++){
			if(!che[i]){
				che[i + 1] = true;
				yono++;
			}
		}
		ou.println(yono);
		ou.flush();
	}
}