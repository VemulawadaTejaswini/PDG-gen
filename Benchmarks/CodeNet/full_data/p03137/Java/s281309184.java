import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();
		//Long[] array = new Long[6];
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i=0;m>i;i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		List<Integer> list_sa=new ArrayList<Integer>();
		Collections.sort(list);
		for(int i=0;m-1>i;i++) {
			list_sa.add(list.get(i+1)-list.get(i));
		}
		Collections.sort(list_sa, Collections.reverseOrder());
		//System.out.println(list_sa);
		if(list_sa.size()==0) {
			System.out.println(0);
			System.exit(0);
		}
		for(int i=0;n-1>i;i++) {
			list_sa.remove(0);
		}
		int answer=0;
		for(int i=0;list_sa.size()>i;i++) {
			answer=answer+list_sa.get(i);
		}
		System.out.println(answer);
	}
}