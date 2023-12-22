import java.util.*;
public class Main{
	static int GCM(int a, int b){
		int p = Math.max(a, b);
		int q = Math.min(a, b);
		int r = p % q;
		while(r!=0){
			p = q;
			q = r;
			r = p % q;
		}
		return q;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		int g = GCM(n, m);
		long l = m / g * n;
		int a = n / g;
		int b = m / g;
		boolean bl = false;
		for(int i=0; i<g; i++){
			if(s.charAt(i*a)!=t.charAt(i*b)){
				bl = true;
				break;
			}
		}
		System.out.println(bl==false ? l : -1);
	}
}