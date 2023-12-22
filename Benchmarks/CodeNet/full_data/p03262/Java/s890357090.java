import java.util.ArrayList;
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
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			int b = Math.abs(x-a);
			list.add(b);
		}

		while(true) {
			if(list.size()==1)
				break;
			int a = list.get(0);
			int b = list.get(1);
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
			list.add(b);
			list.remove(0);
			list.remove(0);
		}
		System.out.println(list.get(0));

	}
}