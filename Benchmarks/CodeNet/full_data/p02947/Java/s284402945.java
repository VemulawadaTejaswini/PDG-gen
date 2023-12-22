
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,Integer >cnt = new HashMap<>();
		int a = sc.nextInt();
		long answer = 0;
		
		for(int i=0;i<a;i++) {
			String b = sc.next();
			char[] str = new char[10];
			for(int j=0;j<10;j++) {
				str[j] = b.charAt(j);
			}
			Arrays.sort(str);
			String s = String.valueOf(str);
			Integer n = cnt.get(s);
			if(n == null) {
				cnt.put(s,1);
			}else {
				answer += n;
				cnt.put(s,n+1);
			}
			
			
		}
		
		System.out.println(answer);
		
		
		
		/*int samecnt = 0;
		for(int i=0;i<a;i++) {
			for(int j=i+1;j<a;j++) {
				if(s[i].equals(s[j])) {
					samecnt++;
				}else {
					break;
				}
			}
		}
		
		
		System.out.println(samecnt);*/
		sc.close();

	}

}
