import static java.lang.System.*;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		
		String str = sc.next();
		char[] chr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		int n = str.length();
		int a = sc.nextInt();
		
		int count=0;
		for(char c='a'; c<='z'; c++) {
			HashSet<String> hash = new HashSet<String>();
			
			for(int i=0; i<n; i++) {
				if(c != chr[i]) continue;
				
				for(int j=i; j<n; j++) 
					hash.add(sb.substring(i, j+1));
			}

			//out.println(c + " " + count + " " + hash.size() + " " + hash);
			if(count + hash.size() < a) {
				count += hash.size();
				continue;
			}
			else {
				Object[] array = hash.toArray();
				Arrays.sort(array);
				out.println(array[a-count-1]);
				break;
			}
		}
	}

}
