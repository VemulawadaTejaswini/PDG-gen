import java.util.*;
public class Main{
	static int TwoSwitches(int p, int q, int r, int s){
		if(q<=r)return 0;
		else if(p<=r && r<=q && q<=s)return q-r;
		else if(r<=p && q<=s)return q-p;
		else if(p<=r && s<=q)return s-r;
		else if(r<=p && p<=s && s<=q)return s-p;
		else return 0;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		System.out.println(TwoSwitches(a, b, c, d));
	}
}