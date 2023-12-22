import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int k = Integer.parseInt(scan.next());
		int[] a =new int[n];
		for (int i = 0; i < n;++i){
			a[i]=Integer.parseInt(scan.next());
		}
		n-=k;
		int ans=1;
		while (n>0){
			++ans;
			n=n-k+1;
		}

		System.out.print(ans);


}
}
//end