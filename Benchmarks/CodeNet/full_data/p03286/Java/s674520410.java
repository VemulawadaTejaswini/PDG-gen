import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap hs = new HashMap();
		PrintWriter ou = new PrintWriter(System.out);
		long n = Long.parseLong(sc.next());
		if(n == 0) ou.print(0);
		sc.close();
		long che = 1;
		int cou = 0;
		boolean[] ebishu = new boolean[100000];
		while(n != 0){
			che *= -2;
			if(n % Math.abs(che) != 0){
				ebishu[cou] = true;
				n += che / 2;
			}
			cou++;
		}
		for(int i = cou - 1 ; i >= 0 ; i--){
			if(ebishu[i]) ou.print(1);
			else ou.print(0);
		}
		ou.print("\n");
		ou.flush();
	}
}