import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int tot = 0, mn = 500000;
		for(int i = 1; i <= n; i++){
			tot = tot + (l + i -1);
			if( Math.abs(mn) > Math.abs(l+i-1) )
				mn = l+i-1;
		}

		tot = tot - mn;
		System.out.println(tot);
	}
}