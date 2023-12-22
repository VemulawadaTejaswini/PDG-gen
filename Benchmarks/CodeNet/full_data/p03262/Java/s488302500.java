import java.util.*;
public class Main{
	static int GCD(int p, int q){
      	if(p==-1)return q;
		if(p<q)return GCD(q, p);
		if(q==0)return p;
		return GCD(q, p%q);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int X = sc.nextInt();
		int[] x = new int[n];
		int cgcd = -1;
		for(int i=0; i<n; i++){
			x[i] = sc.nextInt();
			cgcd = GCD(cgcd, Math.abs(x[i]-X));
		}
		System.out.println(cgcd);
	}
}