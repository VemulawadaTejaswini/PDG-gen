import java.util.Scanner;

public class Main {
	static boolean win(StringBuilder a, StringBuilder b){
		StringBuilder c = new StringBuilder(a);
		StringBuilder d = new StringBuilder(b);
		for(int i=0; i<c.length(); i++){
			if(c.charAt(i) == '?') c.setCharAt(i, 'a');
		}
		for(int i=0; i<d.length(); i++){
			if(d.charAt(i) == '?') d.setCharAt(i, 'z');
		}
		for(int i=0; i<c.length() && i<d.length(); i++){
			if(c.charAt(i) != d.charAt(i)){
				return c.charAt(i) < d.charAt(i);
			}
		}
		return c.length() <= d.length();
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) a[i] = sc.nextInt();
		long ans = (long)1e11;
		for(int i=0; i<(1<<n); i++){
			int cnt = 0;
			long cst = 0, cur = 0;
			for(int j=0; j<n; j++){
				if((i >> j) % 2 == 1){
					cnt++;
					if(cur < a[j]) cur = a[j];
					else{
						cst += cur - a[j] + 1;
						cur++;
					}
				}
			}
			if(cnt >= k) ans = Math.min(ans,  cst);
		}
		System.out.println(ans);
	}
}
