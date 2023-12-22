import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		HashMap<String,Long> gram=new HashMap();
		long ans=0L;
		for(int i=0; i<N; i++) {
			String s=sc.next();
			char[] c=new char[s.length()];
			c=s.toCharArray();
			Arrays.sort(c);
			String s2=String.valueOf(c);
			if(gram.containsKey(s2)) {
				gram.put(s2,gram.get(s2)+1L);
			}
			else {
				gram.put(s2,1L);
			}
		}

		for(long num : gram.values()) {
			ans+=(num-1)*num/2L;
		}
		p(ans);

	}
	public static void p(Object o) {
		System.out.println(o);
	}
}