import java.util.*;

public class Main {

	// test 4  D
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();

		int i,j,k;
		int slen= n;
		int total=0;
		char ch_i, ch_j, ch_k;
		// 1st point loop
		for (i=0;i<slen-2;i++) {
			ch_i = s.charAt(i);
			for(j=i+1;j<slen-1;j++) {
				ch_j=s.charAt(j);
				if (ch_i == ch_j)
					continue;
				for(k=j+1;k<slen;k++) {
					ch_k = s.charAt(k);
					if (ch_k==ch_j || ch_k == ch_i)
						continue;
					// check length
					if ((j-i) != (k-j)) {
						total++;
					}
				}
			}
		}
		
		sc.close();
		log(total);
	}
	
	static void log(String s) {
		System.out.println(s);
	}

	static void log(int i) {
		System.out.println(i);
	}

}
