import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextInt();
		String str = in.next();
		
		char[] ch = new char[str.length()]; 
		  
        for (int i = 0; i < str.length(); i++) { 
            ch[i] = str.charAt(i); 
        }
       
		
		int count = 0;

		for (int i=1; i<=N; i++) {
			for (int j=i+1; j<=N; j++) {
				int k = 2*j-i;
					if ((j-i != k-j) && (ch[i-1] != ch[j-1]) && (ch[i-1] != ch[k-1]) && (ch[j-1] != ch[k-1])) {
						if (k<=N) {
							count++;
						}
					}					
			}
		}
		
		System.out.println(count);
		
	}
}
