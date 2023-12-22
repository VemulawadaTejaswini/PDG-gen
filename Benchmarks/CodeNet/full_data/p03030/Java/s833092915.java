import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		String[] s = new String[n];
		String[] c = new String[n];
		int[] p = new int[n];
		for(int i = 0 ; i < n ; i++){
			s[i] = sc.next();
			p[i] = Integer.parseInt(sc.next());
			c[i] = s[i];
		}
		sc.close();
		Arrays.sort(c);
		for(int i = 0 ; i < n ; i++){
			int yono = 0;
			int ten = 0;
			for(int j = 0 ; j < n ; j++){
				if(c[i].equals(s[j])){
					if(ten < p[j]){
						ten = p[j];
						yono = j;
					}
				}
			}
			p[yono] = -1000;
			ou.print(yono + 1 + "\n");
		}
		ou.flush();
    }
}