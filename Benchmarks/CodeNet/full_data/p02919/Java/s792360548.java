import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n+1];

		for(int i =0;i<n;i++) {
			a[i]= sc.nextInt();
			b[a[i]]=i;
		}
		b[0]=-1;

		TreeMap<Integer,Integer> treeMap = new TreeMap<>();
		treeMap.put(-1,n+1);
		treeMap.put(n, n+1);
		treeMap.put(b[n], n);


		long sum = 0;

		for(long i=n-1;i>=1;i--) {
			treeMap.put(b[(int) i], (int) i);
			long lu = treeMap.higherKey(b[(int) i]);
			long uu = n;
			if(lu<n) {
				uu = treeMap.higherKey((int) lu);
			}
			long ul = treeMap.lowerKey(b[(int) i]);
			long ll = -1;
			if(ul>-1) {
				ll = treeMap.lowerKey((int) ul);
			}
			sum+=((ul-ll)*(lu-b[(int) i])+(uu-lu)*(b[(int) i]-ul))*i;

		}


		System.out.println(sum);
	}
}