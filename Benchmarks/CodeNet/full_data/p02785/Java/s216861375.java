import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();
		//int[] array = new int[1000000000*2];
		int n = sc.nextInt();
		int k = sc.nextInt();
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		Collections.sort(list, Collections.reverseOrder());
		if(k>=n)
			System.out.println(0);
		else {
			for(int i=0;k>i;i++) {
				list.remove(0);
			}
			long count=0;
			for(int i=0;list.size()>i;i++) {
				count=count+list.get(i);
			}
			System.out.println(count);
		}
	}
}