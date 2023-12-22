import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		List<int[]> list1 = new ArrayList<>();

		StringBuilder buf = new StringBuilder();
		String s1 = "0";
		String s = "";

		for(int i=0; i<M;i++) {
			int a[] = new int[3];
			a[0] = Integer.parseInt(sc.next());
			a[1] = Integer.parseInt(sc.next());
			a[2] = i;
			list1.add(a);
		}
		List<int[]> list2 = new ArrayList<>(list1);
		List<int[]> list3 = new ArrayList<>();

		list2.sort((a1,a2)->a1[1]-a2[1]);
		int cnt=0,before0=0;
		for(int[]a:list2) {
			int b[] = new int[3];

			if(before0 < a[0]) {
				cnt=1;
			}else {
				cnt++;
			}

			before0 = a[0];
			b[0] = a[0];
			b[1] = cnt;
			b[2] = a[2];
			list3.add(b);
			
		}

		list3.sort((a1,a2)->a1[2]-a2[2]);
		for(int[]a:list3) {
			int keta = String.valueOf(a[0]).length();
			for(int i = 6;i>keta;i--) {
				buf.append(s1);
			}
			buf.append(a[0]);
			keta = String.valueOf(a[1]).length();
			for(int i = 6;i>keta;i--) {
				buf.append(s1);
			}
			buf.append(a[1]);
			s = buf.toString();
			buf.setLength(0);
			System.out.println(s);

		}


	}

}
