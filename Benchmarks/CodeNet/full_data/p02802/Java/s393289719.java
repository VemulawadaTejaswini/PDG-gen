import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		ArrayList<Integer> la = new ArrayList<Integer>();
		int yo = 0;
		int no = 0;
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int[] p = new int[m];
		String[] s = new String[m];
		for(int i = 0 ; i < m ; i++){
			p[i] = Integer.parseInt(sc.next());
			s[i] = sc.next();
			if(!la.contains(p[i]) && "WA".equals(s[i])){
				no++;
			}else if(!la.contains(p[i]) && "AC".equals(s[i])){
				yo++;
				la.add(p[i]);
			}
		}
		ou.print(yo + " " + no + "\n");
		ou.flush();
    }
}