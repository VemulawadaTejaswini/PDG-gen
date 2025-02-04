
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Committee {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		in.nextLine();
		String[] P = new String[N];
		for (int i = 0; i < P.length; i++) {
			P[i] = in.nextLine();
		}
		
		int res = 0;
		LinkedList<Character> cur = new LinkedList<Character>() ;
		
		Arrays.sort(P);
		for (int i = 0; i < P.length; i++) {
			if (i<P.length-1&&P[i].equals(P[i+1])) {
				P[i]=null;
				continue;
			}
		}
		
		for (int i = 0; i < P.length; i++) {		
			if (P[i]!=null) {
				Character tmp = P[i].toLowerCase().charAt(0);
				if (!cur.contains(tmp)) {
					cur.add(tmp);
					P[i] = null;
					if (cur.size()==K) {
						i = res;
						res++;
						while (cur.size()!=0) {
							cur.remove(cur.size()-1);
						}						
					}
				}
			}else{
				continue;
			}			
		}
			
		System.out.println(res);
	}
}
