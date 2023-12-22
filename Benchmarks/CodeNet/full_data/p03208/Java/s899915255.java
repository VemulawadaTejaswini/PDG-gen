import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list_sa=new ArrayList<Integer>();
		//Long[] array = new Long[6];
		int n = sc.nextInt();
		int k = sc.nextInt();
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		Collections.sort(list);
		for(int i=0;n-k+1>i;i++) {
			int a = list.get(i+k-1)-list.get(i);
			list_sa.add(a);
		}
		int answer = Collections.min(list_sa);
		System.out.println(answer);
	}
}