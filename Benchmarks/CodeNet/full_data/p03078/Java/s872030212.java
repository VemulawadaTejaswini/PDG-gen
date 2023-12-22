import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main (String[] args) {

		Main main = new Main ();
		main.solve();
	}

	private void solve() {

		Scanner sc = new Scanner (System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int k = sc.nextInt();

			long[] listx = new long [x];
			long[] listy = new long [y];
			long[] listz = new long [z];

			for (int index=0; index<x; index++) {
				listx[index]=sc.nextLong();
			}
			for (int index=0; index<y; index++) {
				listy[index]=sc.nextLong();
			}
			for (int index=0; index<z; index++) {
				listz[index]=sc.nextLong();
			}
			long[] list = new long[x*y];
			int num = 0;
			for (int index=0; index<x; index++) {
				for (int index2=0; index2<y; index2++) {
					list[num]=listx[index]+listy[index2];
					num++;
				}
			}
			Arrays.sort(list);
			Arrays.sort(listz);
			int listIndex = list.length-1;
			int listzIndex = listz.length-1;
			long list2[] = new long [(listIndex+1)*(listzIndex+1)];
			num=0;
			for (int index=listIndex; index>=0; index--) {
				for (int index2=listzIndex; index2>=0; index2--) {
					list2[num]=list[index]+listz[index2];
					num++;
				}
			}
			Arrays.sort(list2);

			num=list2.length-1;
			for (int index=0; index<k; index++) {
				System.out.println(list2[num-index]);
			}

	}
}