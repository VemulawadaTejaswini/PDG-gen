import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt(),m=sc.nextInt(),X=sc.nextInt(),Y=sc.nextInt();
		Integer[] Amap=new Integer[n],Bmap=new Integer[m];

		for(int i=0;i<n;i++) {
			Amap[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			Bmap[i]=sc.nextInt();
		}

		Arrays.sort(Amap,Collections.reverseOrder());
		Arrays.sort(Bmap);

		if(X<=Amap[0] && Amap[0]<Y) {
			if(X<Bmap[0] && Bmap[0]<=Y) {
				if(Amap[0]<Bmap[0]) {
					System.out.println("No War");
					return;
				}
			}
		}
		System.out.println("War");
	}
}