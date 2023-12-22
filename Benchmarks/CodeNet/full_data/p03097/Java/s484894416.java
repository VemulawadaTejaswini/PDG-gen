import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();
		long a = sc.nextInt();
		long b = sc.nextInt();

		int ac=0, bc=0;
		for(long i=a; i>0; i>>=1) if((i&1) > 0) ac++;
	    for(long i=b; i>0; i>>=1) if((i&1) > 0) bc++;
		//out.println(ac + " " + bc);
		
			
		int[] num = new int[n+1];
		Arrays.fill(num, 0);
		num[0] = 1;
		for(int i=0; i<n; i++) 
			for(int j=i; j>=0; j--) num[j+1] += num[j];
        //for(int i=0; i<=n; i++) out.print(num[i] + " ");
		//out.println();
			
		for(int i=Math.min(ac,bc); i<=Math.max(bc,ac); i++) 
			num[i]--;
		
		for(int i=0; i<n; i++) num[i+1] -= num[i];
		
		
		if(num[n] != 0) out.println("NO");
		else {
			out.println("YES");
			
			for(long i=1; i<(1<<n); i<<=1) {
				if (((a&i) ^ (b&i)) != 0) {
					search(n, a, b, i);
					break;
				}
			}
		}
    }
	
	static void search(int n, long a, long b, long m) {
		if(m == (1<<n)-1) {
			out.println(a);
			out.println(b);
			return;
		}
		
	    for(int i=1; i<(1<<n); i<<=1) {
			if((m&i) ==0 && ((a&i) ^ (b&i)) == 0) {
				search(n, a, a^i, m|i);
				search(n, b^i, b, m|i);
				break;
			}
		}
	}

}