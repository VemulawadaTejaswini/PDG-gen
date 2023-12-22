import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();
		//int[] array_k = new int[100000];
		int n = sc.nextInt();
		int x = sc.nextInt();
		List<Integer> list_sa=new ArrayList<Integer>();
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		for(int i=0;n-1>i;i++) {
			int a = Math.abs(list.get(i)-list.get(i+1));
			list_sa.add(a);
		}
		if(n==1) {
			System.out.println(list.get(0)-x);
			System.exit(0);
		}
		else if(n==2) {
			System.out.println(list_sa.get(0));
			System.exit(0);
		}
		else {
			List<Integer> list_kouyaku=new ArrayList<Integer>();
			Collections.sort(list_sa, Collections.reverseOrder());
			int aa = list_sa.get(0);
			int bb = list_sa.get(1);
			while(true) {
				int c = aa%bb;
				if(c==0)
					break;
				aa=bb;
				bb=c;
			}
			list_kouyaku.add(bb);
			//System.out.println(list_kouyaku);
			//System.out.println(list_sa);

			for(int i=2;list_sa.size()>i;i++) {
				int a = list_sa.get(i);
				System.out.println(a);
				int b = list_kouyaku.get(list_kouyaku.size()-1);
				if(b>a) {
					int d = b;
					b = a;
					a = d;
				}
				while(true) {
					int c = a%b;
					if(c==0)
						break;
					a=b;
					b=c;
				}
				list_kouyaku.add(b);
			}
			System.out.println(list_kouyaku.get(list_kouyaku.size()-1));
		}
	}
}