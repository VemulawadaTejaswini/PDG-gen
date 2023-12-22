
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 1 << n;
		int[] a = new int[m];
		for (int i=0;i<m;i++) {
			a[i]=sc.nextInt();
		}
		MyClass[][] max = new MyClass[m][2];
		for (int i=0;i<m;i++) {
			ArrayList<MyClass> list = new ArrayList<MyClass>();
			list.add(new MyClass(a[i],i));
			for (int j=0;j<n;j++) {
				if ((i>>j)%2!=0) {
					list.add(max[i-(1<<j)][0]);
					if (max[i-(1<<j)][1] != null) {
						list.add(max[i-(1<<j)][1]);
					}
				}
			}
			list.sort(Comparator.comparing((MyClass aa) -> aa.val).thenComparing((MyClass aa)->aa.pos));
			max[i][0]=list.get(list.size()-1);
			for(int j=list.size()-1;j>=0;j--) {
				if (!list.get(j).equals(max[j][0])) {
				max[i][1]=list.get(j);
				break;
				}
			}
		}
	
		int ans = 0;
		for (int i=1;i<m;i++) {
			ans = Math.max(ans, max[i][0].val+max[i][1].val);
			System.out.println(ans);
		}
	}

}
class MyClass {
	public int val;
	public int pos;
	public MyClass (int a, int pos) {
		this.val=a;
		this.pos=pos;
	}
	public boolean equals(Object obj) {
		return obj instanceof MyClass && ((MyClass)obj).val==this.val && ((MyClass)obj).pos==this.pos;
	}
}
