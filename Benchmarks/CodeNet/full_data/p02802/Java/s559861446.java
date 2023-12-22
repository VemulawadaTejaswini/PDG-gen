import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String p[][] = new String[M][2];
		for(int i = 0; i < M; i++) {
			p[i][0] = sc.next();
            p[i][1] = sc.next();
		}
		int AC = 0;
		int WA = 0;
		boolean ac [] = new boolean[N];
		int wa [] = new int[N];
		for(int i = 0; i < M; i++) {
			int a = Integer.parseInt(p[i][0])-1;
			if(ac[a]){
			    continue;    
			}
			if(p[i][1].equals("WA")){
			     wa[a]++;    
			} else {
				AC++;
				WA += wa[a];
				ac[a] = true;
			}
		}
		System.out.println(AC + " " + WA);
	}
}