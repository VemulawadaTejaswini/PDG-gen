import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		String[] m = s.split("");
		int n = m.length;
		
		int bnum = 0;
		int bpos = 0;
		for(int i=0; i<n; i++){
			if(m[i].equals("B")){
				bnum++;
				bpos += i;
			}
		}
		
		for(int i=0; i<bnum; i++){
			ans += n-1 - i;
		}
		ans -= bpos;
		
		System.out.println(ans);
	}
}