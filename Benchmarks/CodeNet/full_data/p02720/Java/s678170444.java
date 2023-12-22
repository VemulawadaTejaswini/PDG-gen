import java.util.Scanner;

public class Main {
	public static boolean check(int n) {
		String s = Integer.toString(n);
		for (int i = 0; i < s.length() - 1; i++) {
			if (Math.abs(s.charAt(i) - s.charAt(i + 1)) > 1)
				return false;
		}
		return true;
	}
	

	public static int adjust(int n) {
		String t = Integer.toString(n);
		int i = t.length() -1;
		while(!check(Integer.parseInt(t.substring(0, i+1))+1)) {
			i--;
		}
		StringBuilder s = new StringBuilder(t);
		s.setCharAt(i, (char)(s.charAt(i)+1));
		for(int j= i+1; j<s.length(); j++) {
			if(s.charAt(j-1)=='0') s.setCharAt(j, '0');
			else s.setCharAt(j, (char)(s.charAt(j-1)-1));
		}
		
		String res = new String(s);
		return Integer.parseInt(res);
	}

	public static int[] N = new int[100002];

	public static void main(String[] args) {
		
		try{
		Scanner sc = new Scanner(System.in);
		int K;
		N[0]=0;
		for(int i=1; i<=10000; i++) {
			if(check(N[i-1]+1)) N[i] = N[i-1]+1;
			else N[i] = adjust(N[i-1]);
		}
		
		K=sc.nextInt();
		for(int i=1; i<=K; i++) {
			System.out.print(N[i]+" ");
		}
		//System.out.println(N[K]);
		} catch(Exception e) {
			
		}
	}

}