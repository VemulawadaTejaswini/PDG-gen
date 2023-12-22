import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list_a=new ArrayList<Integer>();
		List<Integer> list_b=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		int n = sc.nextInt();
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list_a.add(a);
		}
		for(int i=0;n>i;i++) {
			int b = sc.nextInt();
			list_b.add(b);
		}
		for(int i=0;n>i;i++) {
			int a = Collections.max(list_a);
			int b = Collections.max(list_b);
			if(a>b) {
				System.out.println("No");
				System.exit(0);
			}
			list_a.remove(list_a.indexOf(a));
			list_b.remove(list_b.indexOf(b));
		}
		System.out.println("Yes");
	}
}